package JavaPW.dsa.array;

import java.util.Arrays;

public class Second_Smallest {
    public static void main(String[] args) {
        int basicArray[]={9,7,3,2,6,1};
        int arr[]={9,9,2,5,1,1,6,6,7,7,3};

//        First approach would be simpler
//        sort the array and print the second number
//        this will work if there are no duplicates
        Arrays.sort(basicArray); //O(nlogn)
        System.out.println("second smallest element " +arr[1]);



//        second  approach by running two for loop exclusively
//        This will take time of O(n)
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min) min=arr[i];
        }
        System.out.println("First Min : "+min);
        int secondmin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<secondmin && arr[i]!=min) secondmin=arr[i];
        }

        System.out.println("Second Min : "+secondmin);



// Best Solution
//    Previous solution had time complexity as O(n) but it was
//    using two for loop

        int large=arr[0];
        int second_large=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>large){
                second_large=large;
                large=arr[i];
            }

//            If the largest element is found at first index itself
            if(arr[i]>second_large && arr[i]!=large){
                second_large=arr[i];
            }

        }
        System.out.println("First Largest by using optimal approach : "+large);
        System.out.println("Second Largest by using optimal approach : "+second_large);
    }

}
