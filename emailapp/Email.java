package emailapp;

import java.util.*;

public class Email {
    private String lastName;
    private String firstName;
    private String password;
    private String deparment;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 8;
    private String alternateEmail;
    private String companySuffix = "pthk.com";

    // Constructor to receive the first name and the last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        // System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        // Call a method asking for the department and return the department
        this.deparment = setDepartment();
        // System.out.println("Department: " + this.deparment);

        // Call a method that returns a random
        this.password = randomPassword(defaultPasswordLength);
        // System.out.println("Your password is: " + this.password);

        // Combine elements to generate emmail
        email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + deparment + "."
                + companySuffix;
        // System.out.println("Your email is " + email);

    }

    // Ask for the deparment
    private String setDepartment() {
        System.out.println("Hello " + firstName + " " + lastName + "!"
                + "\nPlease enter the department \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none");
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
    private String randomPassword(int length) {
        String passwordSet = "QWERTYUIOPASDFGHJKLZXCVNM123456798*#!$";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: "
                + mailboxCapacity + "mb";
    }
}
