package mca;
import java.util.Scanner;
abstract class Printer {
    abstract void configure();
    abstract void display();
}

// Concrete class: DotMatrix
class DotMatrix extends Printer {
    @Override
    void configure() {
        System.out.println("Configuring Dot-Matrix Printer...");
    }

    @Override
    void display() {
        System.out.println("Dot-Matrix Printer: High durability, slow speed.");
    }
}

// Concrete class: LaserJet
class LaserJet extends Printer {
    @Override
    void configure() {
        System.out.println("Configuring LaserJet Printer...");
    }

    @Override
    void display() {
        System.out.println("LaserJet Printer: High speed, good quality.");
    }
}

public class four1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer printer ; // Reference for abstraction
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Dot-Matrix Printer");
            System.out.println("2. LaserJet Printer");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printer = new DotMatrix();
                    System.out.println("\nDot-Matrix Printer Selected:");
                    printer.configure();
                    printer.display();
                    break;

                case 2:
                    printer = new LaserJet();
                    System.out.println("\nLaserJet Printer Selected:");
                    printer.configure();
                    printer.display();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
