package pattern;

import java.util.Scanner;
//* * * * *
//      *
//    *
//  *
//* * * * *
public class pattern7
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows and columns : ");
        int row=sc.nextInt(),column=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(i==0 || i==row-1 || i+j==row-1){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
