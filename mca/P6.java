package JavaPW.mca;
import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidAge extends Exception {
    public InvalidAge(String message) {
        super(message);
    }
}

class validate {
    void validateAge(int age) throws InvalidAge {
        if (age < 0 || age > 100) {
            throw new InvalidAge("Age cannot be greater than 100 and lesser than 0");
        } else {
            System.out.println("Entered age is: " + age);
        }
    }

    void divideNumbers(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Remainder cannot be zero");
        } else {
            System.out.println("Division of two numbers is: " + (num1 / num2));
        }
    }
}

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        validate obj = new validate();

        while (true) {
            try {
                System.out.println("Enter Your Age: ");
                int age = sc.nextInt();
                obj.validateAge(age);
                break;
            }
            catch (InvalidAge e) {
                System.out.println(e.getMessage());
                sc.nextLine(); // Clear invalid input
            }
            catch (InputMismatchException e) {
                System.out.println("Enter numbers only");
                sc.nextLine(); // Skip invalid input
            }
            catch (Exception e) {
                System.out.println("Other exception");
                sc.nextLine(); // Skip invalid input
            }
        }

        while (true) {
            try {
                System.out.println("Enter numerator number: ");
                int num1 = sc.nextInt();
                System.out.println("Enter Denominator: ");
                int num2 = sc.nextInt();
                obj.divideNumbers(num1, num2);
                break;
            }
            catch (InputMismatchException e){
                System.out.println("Enter number only");
                sc.nextLine();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                sc.nextLine(); // Clear invalid input
            }
            finally {
                System.out.println("Finally Executed");
            }
        }

        sc.close();
        System.out.println("---Program ended---");
    }
}
