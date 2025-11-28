package org.example.connection;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.Scanner;

public class ParticularData { // Class names should start with an uppercase letter
    public void findOnParticularDate(MongoCollection<Document> collection) {
        Scanner scanner = new Scanner(System.in); // Scanner instance for input
        System.out.println("Enter Date: ");
        String date = scanner.nextLine(); // Read user input for the date

        // Find documents with the specified date
        collection.find(new Document("date", date)).forEach((Document doc) -> {
            System.out.println("Data On " + date + " ->> " + doc.toJson()); // Print matching document
        });

        // Notify if no data was found
        if (collection.countDocuments(new Document("date", date)) == 0) {
            System.out.println("No data found for the date: " + date);
        }
    }
}
