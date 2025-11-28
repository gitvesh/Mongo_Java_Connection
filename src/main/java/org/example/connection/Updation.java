package org.example.connection;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.Scanner;

public class Updation { // Class names should start with an uppercase letter
    private final Scanner scanner = new Scanner(System.in); // Initialize Scanner

    public void updateCustomerData(MongoCollection<Document> collection) {
        int bill;
        String name;

        // User input for new bill and updated name
        System.out.println("Enter New Bill: ");
        bill = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left-over
        System.out.println("Enter Updated Name: ");
        name = scanner.nextLine();

        // Create a filter document for searching
        Document searchQuery = new Document("name", name);

        // Create the update document
        Document updatedQuery = new Document("$set", new Document("bill", bill));

        // Update the document
        collection.updateOne(searchQuery, updatedQuery); // Use updateOne for a single update

        System.out.println("Customer Bill Updated Successfully!");
    }
}
