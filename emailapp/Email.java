package emailapp;

import java.util.*;

public class Email {
    private String lastName;
    private String firstName;
    private String password;
    private String deparment;
    private int mailboxCapacity;
    private String alternateEmail;

    // Constructor to receive the first name and the last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        // Call a method asking for the department and return the department
        this.deparment = setDepartment();
        System.out.println("Department: " + this.deparment);
    }

    // Ask for the deparment
    private String setDepartment() {
        System.out.println("Enter the department \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if (depChoice == 1) {
            return "sales";
        }

        else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "Accounting";

        } else {
            return "";
        }

    }

    // Generate a random passoword

    // Set the mailbox capacity

    // Set the alternate email

    // Change the password
}
