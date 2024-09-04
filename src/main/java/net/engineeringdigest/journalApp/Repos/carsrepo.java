package net.engineeringdigest.journalApp.Repos;

import net.engineeringdigest.journalApp.utility.units;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;
import org.springframework.data.mongodb.repository.MongoRepository;

@Component
public interface carsrepo extends MongoRepository<units, ObjectId> {
}
