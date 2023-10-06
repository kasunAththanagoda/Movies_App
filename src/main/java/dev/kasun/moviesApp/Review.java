package dev.kasun.moviesApp;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "reviews")
public class Review {

    @Id
    private ObjectId id;
    private String body;
}
