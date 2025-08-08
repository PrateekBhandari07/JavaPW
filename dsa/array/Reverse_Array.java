package JavaPW.dsa.array;

import java.util.Arrays;
import java.util.Collections;

// Problem Statement: You are given an array. The task is to reverse the array and print it.
public class Reverse_Array {
    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,56,3};

//        First approach
//        use another array of size arr
//        And iterate in reverse direction
//        Time complexity O(n) and space complexity O(n)
        int arr2[]=new int[arr.length];
        int counter=0;
        for(int i=arr.length-1;i>=0;i--){
            arr2[counter]=arr[i];
            counter++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr2[i]+" ");
        }


        System.out.println();
//        Solution 2: Space-optimized iterative method
//        Without using extra space
//        By using two pointer
//        Time complexity O(n)
//        Space Complexity O(1)
        int p1=0,p2=arr.length-1;
        while (p1<p2){
            int temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;
            p1++;
            p2--;
        }
        System.out.println("Sorting using optimized approach");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        Collections.reverse(Arrays.asList(arr));
        for(Integer ele:arr){
            System.out.print(ele+" ");
        }

    }
}
