package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.Repos.userRepo;
import net.engineeringdigest.journalApp.utility.Users;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class userServices {

@Autowired
userRepo user;


//save
    public void saveUser(Users entry){
        user.save(entry);
    }




    //view
    public List<Users> getallUser(){
        return new ArrayList<>(user.findAll());
    }

    //findbyid
    public Optional<Users> getUserdetail(ObjectId id){
        return user.findById(id);
    }

    //update


    //delete
    public void deleteuser(ObjectId id){
        user.deleteById(id);
    }


    public Users findbyuserName(String name){
        return  user.findByuserName(name);
    }


}
