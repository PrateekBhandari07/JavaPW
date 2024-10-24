package sorting;

import java.util.Scanner;

public class SelectionSort
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
            System.out.println(ele);
        }
        System.out.println("sorted elements are : ");

        for(int i=0;i<n-1;i++){
            int min=i;
            System.out.println(i + "iteration");
            for(int j=i+1;j<n;j++){
                System.out.println(i+" "+j);
                if(arr[i]>arr[j]){
                   min=j;
                }
            }
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
        }
        for(int ele:arr){
            System.out.println(ele);
        }
    }
}
