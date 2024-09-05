package pattern;

import java.util.Scanner;
//* * * * * * * * * * * * *
//* *       *   *       * *
//*   *   *       *   *   *
//*     *           *     *
//*   *   *       *   *   *
//* *       *   *       * *
//*           *           *
//* *       *   *       * *
//*   *   *       *   *   *
//*     *           *     *
//*   *   *       *   *   *
//* *       *   *       * *
//* * * * * * * * * * * * *
public class pattern12
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the pattern : ");
        int n=sc.nextInt();
        int half=n/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int mod=Math.abs(i-j);
                if(i==0||i==n-1||j==0||j==n-1||i==j||i+j==n-1||i+j==(n-1)/2||i+j==(n-1)+half||half==mod){
                    System.out.print("* ");

                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
