//1-digit numbers: All single-digit numbers (0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
// are Armstrong numbers because they are equal to themselves.
//153: 1³ + 5³ + 3³ = 1 + 125 + 27 = 153.
//370: 3³ + 7³ + 0³ = 27 + 343 + 0 = 370.
//371: 3³ + 7³ + 1³ = 27 + 343 + 1 = 371.
//407: 4³ + 0³ + 7³ = 64 + 0 + 343 = 407.
//1634: 1⁴ + 6⁴ + 3⁴ + 4⁴ = 1 + 1296 + 81 + 256 = 1634.

package JavaPW.dsa;
import java.util.Scanner;

public class Day01_Armstrong_Number {
    public static void main(String[] args) {
        System.out.println("Enter a number to check Armstrong number of not");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int length=String.valueOf(num).length();
        int temp=num;
        double result=0;
        for(int i=0;i<length;i++){
            int rem=temp%10;
            result+=Math.pow(rem,length);
            temp/=10;
        }
        if(result==num) System.out.println("It is armstrong number");
        else System.out.println("It is not a armstrong number");
    }
}