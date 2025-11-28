package org.example.connection;

import java.net.UnknownHostException;
import java.util.Scanner;

public class MainDashBoard { // Class names should start with an uppercase letter
    public static void main(String[] args) throws UnknownHostException {
        Connection con = new Connection();

        Deletion del = new Deletion(); // Update class name to start with uppercase
        Insertion insrt = new Insertion();
        ListAll la = new ListAll();
        ParticularData pd = new ParticularData(); // Update class name to follow conventions
        Updation updation = new Updation(); // Update class name to start with uppercase
        Scanner scanner = new Scanner(System.in); // Initialize the Scanner once

        System.out.println("--------------WELCOME TO SATPUDA TRACTOR GARAGE-------------");
        int choice;

        do {
            System.out.println("Enter your choice of operation \n1. Display All \n2. Insert Document \n3. Delete Document \n4. Update \n5. Conditional Display \n6. Exit \n");
            choice = scanner.nextInt(); // Use the initialized scanner
            switch (choice) {
                case 1:
                    la.printAll(con.getCollection()); // Ensure you are calling the right method to get collection
                    break;
                case 2:
                    insrt.InsertDoc(con.getCollection());
                    break;
                case 3:
                    del.delete(con.getCollection());
                    break;
                case 4:
                    updation.updateCustomerData(con.getCollection());
                    break;
                case 5:
                    pd.findOnParticularDate(con.getCollection());
                    break;
                case 6:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println(choice + " is not a valid Menu Option! Please Select Another.");
            }
        } while (choice != 6);

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
