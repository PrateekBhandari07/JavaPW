package JavaPW.dsa.array;

import java.util.Arrays;
import java.util.stream.IntStream;

//Problem Statement: Rearrange the array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order
public class Increasing_Decreasing
{
    public static void main(String[] args) {
        int arr[]={8,7,1,6,5,9};
        Arrays.sort(arr); //O(nlogn)
        for(int i=0;i<arr.length/2;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=arr.length-1;i>=arr.length/2;i--){ //O(n) for two for loop
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nAfter array elements being changed");

//        If you want to change the main array
//        first sort the array then use two pointer approach from mid to end
        int mid=arr.length/2,end=arr.length-1;
        while (mid<end){
            int temp=arr[mid];
            arr[mid]=arr[end];
            arr[end]=temp;
            mid++;
            end--;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
