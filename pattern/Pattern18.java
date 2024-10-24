package pattern;

import java.util.Scanner;

public class Pattern18
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i%2!=0){
                for (int j = 0; j < i; j++) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}
