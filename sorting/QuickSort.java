package sorting;

import java.util.Scanner;

public class QuickSort
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are :");
        for (int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println("\nsorted elements are : ");
        for(int ele:arr){
            System.out.print(ele +" ");
        }
    }
}
