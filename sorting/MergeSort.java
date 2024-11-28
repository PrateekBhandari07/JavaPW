package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        // Call the sort function
        sort(arr, 0, arr.length - 1);

        System.out.println("Sorted elements are:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    // Recursive function to sort the array
    static void sort(int arr[], int first, int last) {
        if (first < last) {
            int mid = first + (last - first) / 2;
//              int mid =arr.length/2;
            // Recursively sort the first half
            sort(arr, first, mid);
            // Recursively sort the second half
            sort(arr, mid + 1, last);

            // Merge the sorted halves
            merge(arr, first, mid, last);
        }
    }

    // Merge two sorted halves
    static void merge(int arr[], int first, int mid, int last) {
        int n1 = mid - first + 1;
        int n2 = last - mid;

        // Temporary arrays
        int left[] = new int[n1];
        int right[] = new int[n2];

        // Copy data to temporary arrays
        System.arraycopy(arr, first, left, 0, n1);
        System.arraycopy(arr, mid + 1, right, 0, n2);

        // Initial indexes for merge process
        int i = 0, j = 0, k = first;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left[], if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of right[], if any
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
