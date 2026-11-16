package ie.atu.oop.week1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<String> registrations = new HashSet<>();
        boolean added = false;

        int rejectedAttempts = 0;

        Scanner input = new Scanner(System.in);

        //registrations.add("S101");

        System.out.println("Workshop name: ");
        String workshopName = input.nextLine();

        if (workshopName.isBlank())
        {
            System.out.println("Workshop name cannot be empty.\nWorkshop name: ");
            workshopName = input.nextLine();
        }
        System.out.println("Capacity: ");
        int capacity = input.nextInt();

        System.out.println("Number of registration attempts: ");
        int registrationAttempts = input.nextInt();

        for (int i = 0; i < registrationAttempts; i++)
        {
            System.out.println("Student ID: ");
            String studentID = input.next();

            if (registrations.contains(studentID))
            {
                System.out.println("Already registered.");
                rejectedAttempts++;
            }
            else if (registrations.size() >= capacity)
            {
                System.out.println("Workshop full.");
                rejectedAttempts++;
            }
            else if (studentID.isBlank())
            {
                System.out.println("Student ID cannot be blank.");
                rejectedAttempts++;
            }
            else {
                registrations.add(studentID);
                System.out.println("Registered.");
            }
        }

        // printing out all ids
        for (String id : registrations)
        {
            System.out.println(id);
        }

        System.out.println("Workshop: " + workshopName);
        System.out.println("Registered students: ");

        System.out.println("Student ID: " + registrations.toString());

        System.out.println("Accepted: " + registrations.size());
        System.out.println("Rejected: " + rejectedAttempts);
        System.out.println("Places remaining: " + (capacity - registrations.size()));
/*
        if (added) {
            System.out.println("Registration successful.");
        } else {
            System.out.println("Already registered.");
        }

        String searchId = "S103";
        if (registrations.contains(searchId)) {
            System.out.println("Registration found.");
        } else {
            System.out.println("Registration not found.");
        }*/


    }
}