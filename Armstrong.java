import java.util.Scanner;

public class Armstrong
{
    public static void main(String[] args) {
        System.out.println("Enter a number to check Armstrong number of not");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int length=String.valueOf(num).length();
        int temp=num;
        double result=0;
        for(int i=0;i<length;i++){
            int rem=temp%10;
            result+=Math.pow(rem,length);
            temp/=10;
        }
        if(result==num) System.out.println("Armstrong number");
        else System.out.println("Not an Armstrong number");
    }
}
