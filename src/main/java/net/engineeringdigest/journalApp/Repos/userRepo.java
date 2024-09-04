package net.engineeringdigest.journalApp.Repos;

import net.engineeringdigest.journalApp.utility.Users;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface userRepo extends MongoRepository< Users,ObjectId> {

    Users  findByuserName(String name);
}
