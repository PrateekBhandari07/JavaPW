package sorting;

import java.util.Arrays;
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

        quicksort(arr,0,arr.length-1);


        System.out.println("\nsorted elements are : ");
        for(int ele:arr){
            System.out.print(ele +" ");
        }
    }
     public static  void quicksort(int arr[],int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }

}
     public static int  partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;

     }
     static void swap(int arr[],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
     }
}
