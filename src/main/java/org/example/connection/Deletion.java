package org.example.connection;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.Scanner;

public class Deletion { // Class names should start with an uppercase letter

    Scanner scan = new Scanner(System.in);

    public void delete(MongoCollection<Document> collection) {
        System.out.println("Enter Date: ");
        String date = scan.nextLine(); // Changed to nextLine() to capture the full date

        // Create a filter to find the document to delete
        Document query = new Document("date", date);

        // Delete the document matching the query
        long deletedCount = collection.deleteOne(query).getDeletedCount(); // Returns the number of deleted documents

        if (deletedCount > 0) {
            System.out.println("Data Deleted Successfully!");
        } else {
            System.out.println("No matching data found to delete.");
        }
    }
}
