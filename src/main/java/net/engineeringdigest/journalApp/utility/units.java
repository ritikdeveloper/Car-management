package net.engineeringdigest.journalApp.utility;

import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
@Data
@Document(collection = "cars")
public class units {
    @Id
    private ObjectId id;
    @NonNull
    private String car;
    private String car_number;


}
