package sorting;

import java.util.Scanner;

public class BubbleSort
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
        System.out.println("array.Array elements are :");
        for (int ele: arr) {
            System.out.println(ele);
        }
        for (int i = 0; i < n-1; i++) {
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array");
        for(int ele:arr){
            System.out.println(ele);
        }

    }
}
