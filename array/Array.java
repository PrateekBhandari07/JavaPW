package array;

import java.util.Scanner;

public class Array
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int len=sc.nextInt();
        int arr[]=new int[len];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("array.Array elements are :");
        for (int ele: arr) {
            System.out.println(ele);
        }
        System.out.println();
    }
}
