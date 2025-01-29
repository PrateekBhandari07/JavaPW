package mca;

import java.util.Scanner;

// Step 1: Create the Personal interface
interface Personal {
    void displayPersonalDetails();
}

// Step 1: Create the Official interface
interface Official {
    void displayOfficialDetails();
}

// Step 2: Create the Employee class implementing both interfaces
class Employee implements Personal, Official {
    private String name;
    private int age;
    private String address;
    private String designation;
    private String department;
    private String companyName;

    // Constructor to initialize employee details
    Employee(String name, int age, String address, String designation, String department, String companyName) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.designation = designation;
        this.department = department;
        this.companyName = companyName;
    }

    // Step 3: Implement the methods of Personal interface
    @Override
    public void displayPersonalDetails() {
        System.out.println("\nPersonal Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // Step 3: Implement the methods of Official interface
    @Override
    public void displayOfficialDetails() {
        System.out.println("\nOfficial Details:");
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + department);
        System.out.println("Company Name: " + companyName);
    }
}



public class Multiple_interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = null; // Employee object placeholder

        // Menu-driven program
        while (true) {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Enter Personal and Official Details");
            System.out.println("2. Display Personal Details");
            System.out.println("3. Display Official Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1: // Input details
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();

                    System.out.print("Enter Designation: ");
                    String designation = scanner.nextLine();

                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();

                    System.out.print("Enter Company Name: ");
                    String companyName = scanner.nextLine();

                    // Create an Employee object
                    employee = new Employee(name, age, address, designation, department, companyName);
                    System.out.println("Details saved successfully!");
                    break;

                case 2: // Display personal details
                    if (employee != null) {
                        employee.displayPersonalDetails();
                    } else {
                        System.out.println("No details available. Please enter details first.");
                    }
                    break;

                case 3: // Display official details
                    if (employee != null) {
                        employee.displayOfficialDetails();
                    } else {
                        System.out.println("No details available. Please enter details first.");
                    }
                    break;

                case 4: // Exit the program
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
