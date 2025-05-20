package JavaPW.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CustomException
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Enter age : ");
            try {
                int age = sc.nextInt();
                if (age > 100) {
                    throw new ArithmeticException("Enter age within 100");
                }
                if (age == 0) {
                    throw new ArithmeticException("Age cannot be zero");
                }
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Enter numbers only");
                sc.next();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                sc.next();
            }
        }

    }
}
