package JavaPW.dsa.array;

public class LeftRotateArrayByKPlaces {
    public static void main(String[] args) {

//        brute force approach
        int arr[]={1,2,3,4,5,6,7};
        int k=8;
        // Normalize k if it's greater than length
        k=k%arr.length;

        int temp[]=new int[k];
        // Step 1: Store first k elements
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }

        // Step 2: Shift rest elements to the left
        for(int i=k;i<arr.length;i++){
            arr[i-k]=arr[i];
        }

        for(int ele:arr){
            System.out.print(ele+" ");
        }

        // Step 3: Copy temp elements to the end
        for(int i=0;i<k;i++){
            arr[arr.length-k+i]=temp[i];
        }

        System.out.println();
        for(int ele:arr){                // space Complexity = O(k)
            System.out.print(ele+" ");   //Time complexity O(k+(n-k)+k)=O(n+k)==>O(n)
        }

        System.out.println("\n\nOptimal approach");
        //            optimal approach
        int nums[]={1,2,3,4,5,6,7};
        int shift=3;
        shift=shift%nums.length;
        for(int ele:nums){
            System.out.print(ele+" ");
        }

        System.out.println();
        shift(nums,0,shift-1);
        for(int ele:nums){
            System.out.print(ele+" ");
        }
        System.out.println();


        shift(nums,shift,nums.length-1);
        for(int ele:nums){
            System.out.print(ele+" ");
        }
        System.out.println();


        int e=0,f=nums.length-1;   //time complexity O(d)+O(n-d)+O(n)=O(2n)
        shift(nums,e,f);            // space complexity O(1)
        System.out.println();
        for(int ele:nums){
            System.out.print(ele+" ");
        }

    }
    static void shift(int nums[],int low,int high){
        while (low<high){
            int t=nums[low];
            nums[low]=nums[high];
            nums[high]=t;
            low++;high--;
        }
    }
}
