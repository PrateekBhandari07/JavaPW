package pattern;

import java.util.Scanner;
//*       *
//* *   * *
//*   *   *
//*       *
//*       *
public class pattern8
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows and columns : ");
        int row=sc.nextInt(),column=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(j==0 || j==column-1 ||(i<=row/2&&i==j)||(i+j==row-1 && j>=column/2)){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
