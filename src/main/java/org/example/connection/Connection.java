package org.example.connection;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Connection {
    private static final String URI = "mongodb://localhost:27017"; // Connection URI

    // Method to get a MongoCollection
    public MongoCollection<Document> getCollection() {
        // Create a MongoClient
        MongoClient mongoClient = MongoClients.create(URI);

        // Access the database
        MongoDatabase database = mongoClient.getDatabase("college"); // Replace with your database name

        // Access the collection
        MongoCollection<Document> collection = database.getCollection("Student"); // Replace with your collection name

        return collection;
    }
}
