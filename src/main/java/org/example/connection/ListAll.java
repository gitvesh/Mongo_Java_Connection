package org.example.connection;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class ListAll {
    public void printAll(MongoCollection<Document> collection) {
        System.out.println("All Customer Data:");

        // Iterate through the collection using find() and print each document
        for (Document doc : collection.find()) {
            System.out.println(doc.toJson()); // Print each document in JSON format
        }
    }
}
