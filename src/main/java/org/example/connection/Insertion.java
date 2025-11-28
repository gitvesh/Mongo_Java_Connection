package org.example.connection;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.Scanner;

public class Insertion {
    Scanner scan = new Scanner(System.in);

    public void InsertDoc(MongoCollection<Document> collection) {
        String name;
        String add;
        int bill;
        String date;
        String tractor;

        System.out.println("Enter customer Data : ");

        System.out.println("Enter name: ");
        name = scan.next(); // Changed to nextLine() to capture full name if needed

        System.out.println("Address: ");
        add = scan.next();

        System.out.println("Enter your tractor: ");
        tractor = scan.next();

        System.out.println("Enter Date: ");
        date = scan.next();

        System.out.println("Enter total bill: ");
        bill = scan.nextInt();

        // Create a new Document
        Document document = new Document("name", name)
                .append("Address", add)
                .append("Tractor", tractor)
                .append("Date", date)
                .append("Bill", bill);

        // Insert the document into the collection
        collection.insertOne(document);
        System.out.println("Hey!!, Customer Data Successfully Inserted");
    }
}
