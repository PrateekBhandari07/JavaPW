package JavaPW.dsa.array;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {


        System.out.println("Inplace");
        int arr1[]={1,2,3,0,0,0};
        int arr2[]={2,5,6};
        merge(arr1,3,arr2,3);

        System.out.println("\nOptimal approach");
//        int nums1[]={1,2,3,0,0,0};
//        int nums2[]={2,5,6};
//        inplace(nums1,3,nums2,3);

        int nums1[]={0};
        int nums2[]={2};
        inplace(nums1,0,nums2,1);
    }

    public static void inplace(int[] nums1, int m, int[] nums2, int n){
        int i=m-1,j=n-1;
        int index=m+n-1;
        while (i>=0 && j>=0){       // time complexity O(m+n)
            if(nums1[i]>=nums2[j]){
                nums1[index]=nums1[i];
                index--;
                i--;
            }
            else {
                nums1[index]=nums2[j];
                index--;
                j--;
            }
        }
        while(i>=0){  // O(m)
            nums1[index]=nums1[i];
            index--;
            i--;
        }
        while (j>=0){       // O(n)
            nums1[index]=nums2[j];
            index--;
            j--;
        }
        for(int ele:nums1){         // time complexity O(m+n)
            System.out.print(ele+" "); // space complexity O(1)
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int output[]=new int[m+n]; // space Complexity O(m+n)
        int i=0,j=0;
        int index=0;
        while(i<m && j<n){    // Time complexity O(m+n)
            if(nums1[i]<=nums2[j]){
                output[index]=nums1[i];
                index++;
                i++;
            }
            else{
                output[index]=nums2[j];
                index++;
                j++;
            }
        }
        while(i<m){         // O(m)
            output[index]=nums1[i];
            index++;
            i++;
        }
        while(j<n){         //O(n)
            output[index]=nums2[j];
            index++;
            j++;
        }
        for(int k=0;k<output.length;k++){ // O(m+n)
            nums1[k]=output[k];
        }
        for(int ele:output){
            System.out.print(ele+" "); // Total time complexity O(m+n)+O(m)+O(n)+O(m+n)==> O(m+n)
        }
    }
}
