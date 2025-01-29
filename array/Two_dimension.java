package array;

import java.util.Scanner;

public class Two_dimension
{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row=sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("enter "+row*col+" values :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array elements are  : ");
        for(int i=0;i<row;i++){
            System.out.println();
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
        }
//        for(int a[]:arr){
//            System.out.println(a);
//        }
    }
}
