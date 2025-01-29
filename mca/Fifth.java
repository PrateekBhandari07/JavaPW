package mca;

import java.sql.SQLOutput;
import java.util.Scanner;

interface personal{
    void personaldetails();
}

interface official{
    void officialdetails();
}

class Employeee implements personal,official{
    String company_Name,Designation;
    int salary;
    String name,address;
    int age;
    Employeee (String name,String address, int age,String company_Name,String designation ,int salary){
        this.name=name;
        this.address=address;
        this.age=age;
        this.company_Name=company_Name;
        this.Designation=designation;
        this.salary=salary;
    }
    @Override
    public void officialdetails() {
        System.out.println("---Official Details---");
        System.out.println("Company Name : "+company_Name);
        System.out.println("Work Position : "+Designation);
        System.out.println("Salary : "+salary);

    }

    @Override
    public void personaldetails() {
        System.out.println("Name : "+name);
        System.out.println("Residential Address : "+address);
        System.out.println("Age : "+age);
    }
}
public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employeee emp = null;
        boolean check = true;
        while (true) {
            System.out.println("----Employee Database----");
            System.out.print(" 1 : Enter a details \n 2 : Display Personal Details \n 3 : Display Official Details \n 4 : exit \n Enter a choice : ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the Employee: ");
                    String name = sc.nextLine();

                    System.out.print("Enter his/her Address: ");
                    String address = sc.nextLine();

                    System.out.print("Enter the age of the Employee: ");
                    int age = sc.nextInt();
                    sc.nextLine(); // Consume the leftover newline character

                    System.out.print("Enter the Company Name: ");
                    String company_Name = sc.nextLine();

                    System.out.print("Enter the Designation: ");
                    String designation = sc.nextLine();

                    System.out.print("Enter the Salary: ");
                    int salary = sc.nextInt();
                    sc.nextLine();
                    emp = new Employeee(name, address, age, company_Name, designation, salary);
                    System.out.println("\nEmployee Details Entered Successfully!");
                    break;

                case 2:
                    if (emp != null) {
                        System.out.println("You Clicked on Display personal Details section");
                        emp.personaldetails();
                    } else {
                        System.out.println("No details available");
                    }
                    break;

                case 3:
                    if(emp!=null){
                        System.out.println("You Clicked on Display Official Details section");
                        emp.officialdetails();
                    }
                    else {
                        System.out.println("No details available");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");

            }

        }
    }
}
