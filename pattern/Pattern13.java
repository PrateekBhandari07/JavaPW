package JavaPW.pattern;

import java.util.Scanner;
public class Pattern13
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the pattern : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=n;
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||i==j||i+j==n-1||(i+j<n-1 && i<j)||(i+j>n-1&& i>j)){
                    System.out.print(num+" ");
                    num--;
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
//output
//7 6 5 4 3 2 1
//  7 6 5 4 3
//    7 6 5
//      7
//    7 6 5
//  7 6 5 4 3
//7 6 5 4 3 2 1