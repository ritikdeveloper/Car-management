package net.engineeringdigest.journalApp.controller;


import net.engineeringdigest.journalApp.utility.units;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class carcontroller {

    @Autowired
    units unit;


     private Map<Long ,units> carsDetails = new HashMap();

    @GetMapping
    public List<units> getdetails(){
        return new ArrayList<>(carsDetails.values());
    }
    @PostMapping
    public Boolean inputdetails(@RequestBody units myentry   ){
        carsDetails.put(myentry.getId(),myentry);
        return true;

    }

    @DeleteMapping("/{id}")
    public units  remove(@PathVariable long id){
        return carsDetails.remove(id);
    }

    @GetMapping("/{id}")
        public units getdetail(@PathVariable long id){
            return carsDetails.get(id);
        }

    @PutMapping("/{id}")
    public units changedetail(@PathVariable long id , @RequestBody units myentry){

        return carsDetails.put(id,myentry);
    }




}
