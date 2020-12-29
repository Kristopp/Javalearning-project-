package emailapp;

import java.awt.*;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private int passWordLength = 10;
    private String alternateEmail;
    //Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //Call set department method
        this.department = setDepartment();
        this.password = randomPassword(passWordLength);
        System.out.println("hello");
    }
    private String setDepartment() {
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1) {return "sales";}
        else if(depChoice == 2) {return "dev";}
        else { return ""; }
    }
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@G#$%";
        char[] password = new char[length];
        for (int i=0;i<length;i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String((password));
    }

    //ask for department
    //Generate random password
    //Set the alternate email
    //Change the password
}
