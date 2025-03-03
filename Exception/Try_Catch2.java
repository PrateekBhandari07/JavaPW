package JavaPW.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch2 {
    public static void main(String[] args) {

        int num1=0,num2=0;
        Scanner sc=new Scanner(System.in);
        while (true){
            try {
                System.out.println("Enter first number : ");
                num1=sc.nextInt();
                break;
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input Enter the number again");
                sc.next(); //it clears the buffer
            }
        }

        while (true){
            try {
                System.out.println("Enter Second number : ");
                num2=sc.nextInt();
                break;
              }
            catch (InputMismatchException e){
                System.out.println("Invalid input Enter the number again");
                sc.next();
            }
        }
        int length=String.valueOf(num1).length();
        System.out.println("Length : "+length);
        double result=0;
        try{
            result=(double) num1/num2;
            System.out.println(num1+" / "+num2+" = "+result);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide a number by zero");
        }

        finally {
            System.out.println("Done calculations");
        }
    }
}
