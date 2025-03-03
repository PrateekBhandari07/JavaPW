package JavaPW.Exception;

import java.util.Scanner;

//Exception is an event that disrupts the normal flow of a program during its execution
class Try_Catch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numerator : ");
        int num1=sc.nextInt();
        System.out.println("Enter denominator : ");
        int num2=sc.nextInt();
        try{
            int result=num1/num2;
            System.out.println("Result "+num1+" / "+num2+" = "+result);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){//for multiple exception
            System.out.println("Cannot divide by zero");
            System.out.println(e.getMessage());
            System.out.println(e);
        }
        catch (Exception e){//It will handle all exception
            System.out.println("Handling all exception");
        }
        finally {
            System.out.println("Executed the program");
        }
    }
}
