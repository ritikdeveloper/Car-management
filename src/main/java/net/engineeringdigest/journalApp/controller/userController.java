package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.service.userServices;
import net.engineeringdigest.journalApp.utility.Users;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Usermanage")
public class userController {
@Autowired
userServices user;

@GetMapping
    public List<Users> getDetails(){
    return user.getallUser();

}


@PostMapping
public void save(@RequestBody Users entry){
    user.saveUser(entry);
}


@DeleteMapping("/{id}")
public void remove(@PathVariable ObjectId id){
    user.deleteuser(id);
}



@GetMapping("/{id}")
    public Users getdetails(@PathVariable ObjectId id){
    return user.getUserdetail(id).orElse(null);
}


@PutMapping
    public ResponseEntity<?> updateDeeails(@RequestBody Users entry){

    Users userindb = user.findbyuserName(entry.getUserName());
    if(userindb!=null){
        userindb.setUserName(entry.getUserName());
        userindb.setPassWord(entry.getPassWord());
        user.saveUser(userindb);
    }
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}

}
