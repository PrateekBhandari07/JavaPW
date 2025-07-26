package JavaPW.assingment;

import java.util.Scanner;
import java.util.Arrays;

public class KthElement {

    // Function to find the k-th smallest element in the union of two sorted arrays
    public static int findKthElement(int[] nums1, int[] nums2, int k) {
        if (nums1.length > nums2.length) {
            return findKthElement(nums2, nums1, k); // Ensure nums1 is smaller
        }

        int m = nums1.length, n = nums2.length;
        int low = Math.max(0, k - n);
        int high = Math.min(k, m);

        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = k - mid1;

            int left1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1 - 1];
            int left2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];
            int right1 = (mid1 == m) ? Integer.MAX_VALUE : nums1[mid1];
            int right2 = (mid2 == n) ? Integer.MAX_VALUE : nums2[mid2];

            if (left1 <= right2 && left2 <= right1) {
                return Math.max(left1, left2); // Found the k-th element
            } else if (left1 > right2) {
                high = mid1 - 1; // Too many from nums1, reduce
            } else {
                low = mid1 + 1; // Need more from nums1, increase
            }
        }
        return -1; // Should not reach here if inputs are valid
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first array
        System.out.print("Enter the size of the first sorted array: ");
        int m = sc.nextInt();
        int[] nums1 = new int[m];
        System.out.println("Enter " + m + " sorted elements for the first array:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // Input for second array
        System.out.print("Enter the size of the second sorted array: ");
        int n = sc.nextInt();
        int[] nums2 = new int[n];
        System.out.println("Enter " + n + " sorted elements for the second array:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        // Input for k
        System.out.print("Enter the value of k to find the k-th smallest element: ");
        int k = sc.nextInt();

        // Validate k
        if (k < 1 || k > (m + n)) {
            System.out.println("Invalid value of k. It should be between 1 and " + (m + n));
        } else {
            int result = findKthElement(nums1, nums2, k);
            System.out.println("The " + k + "-th smallest element in the merged sorted arrays is: " + result);
        }

        sc.close();
    }
}
