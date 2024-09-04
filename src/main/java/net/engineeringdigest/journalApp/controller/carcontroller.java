package net.engineeringdigest.journalApp.controller;


import net.engineeringdigest.journalApp.service.controllerservice;
import net.engineeringdigest.journalApp.service.userServices;
import net.engineeringdigest.journalApp.utility.Users;
import net.engineeringdigest.journalApp.utility.units;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//@RequestMapping("/cars")
@RestController
public class carcontroller {

    @Autowired
    controllerservice service;
    @Autowired
    private userServices user;



    @GetMapping("/{username}")
    public List<units> getdetails(@PathVariable String username){
        Users userDetail = user.findbyuserName(username);
        return userDetail.getCars();
    }
    @PostMapping("/{username}")
    public Boolean inputdetails(@RequestBody units myentry   ){

        service.saveEntry(myentry);
        return true;
    }

    @DeleteMapping("/{id}")
    public void  remove(@PathVariable ObjectId id){
         service.deleteEntry(id);
    }

//    @GetMapping("/{id}")
//        public units getdetail(@PathVariable ObjectId id){
//            return service.getDetails(id).orElse(null);
//        }

    @PutMapping("/{id}")
    public units changedetail(@PathVariable ObjectId id , @RequestBody units myentry){

        return service.updateDetails(id,myentry);
    }




}
