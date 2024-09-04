package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.Repos.carsrepo;
import net.engineeringdigest.journalApp.utility.units;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class controllerservice {

    @Autowired
    carsrepo repo;


    public List<units> getdata() {
        return repo.findAll();
    }


    public void saveEntry(units unit,){
        repo.save(unit);
    }
    public void deleteEntry(ObjectId id){
        repo.deleteById(id);
        ;
    }
    public Optional<units> getDetails(ObjectId id){
      return  repo.findById(id);
    }

    public units updateDetails(ObjectId id,units myentry){
        units oldentry = repo.findById(id).orElse(null);
        if(myentry.getCar()!=null && myentry.getCar()!="")oldentry.setCar(myentry.getCar());
        if(myentry.getCar_number()!=null && myentry.getCar()!="")oldentry.setCar_number(myentry.getCar_number());
        repo.save(oldentry);
        return oldentry;



    }

}