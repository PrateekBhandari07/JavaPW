package pattern;

import java.util.Scanner;
//* * * * * * * * *
//* * * *   * * * *
//* * *       * * *
//* *           * *
//*               *
//* *           * *
//* * *       * * *
//* * * *   * * * *
//* * * * * * * * *
public class pattern16
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the pattern : ");

        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=1;
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||j==0||j==n-1||
                i+j<=(n-1)/2||i+j>=(n-1)+(n-1)/2||(i-j)>=(n-1)/2||(j-i)>=(n-1)/2){
                    System.out.print(num+" ");
                    num++;
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
