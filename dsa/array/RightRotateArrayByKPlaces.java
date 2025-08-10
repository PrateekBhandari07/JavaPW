package JavaPW.dsa.array;

public class RightRotateArrayByKPlaces
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        k=k%arr.length;

        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[arr.length-k+i];
        }
        for(int i=arr.length-k-1;i>=0;i--){
            arr[i+k]=arr[i];
        }
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
        for(int ele:arr){
            System.out.print(ele+" ");    // space complexity O(k)
        }                                 // time complexity O(n)

        System.out.println("\nOptimal approach");
//        optimal approach  to make space complexity as O(1)
        int nums[]={1,2,3,4,5,6,7,8};
        int shift=6;
        shift=shift%nums.length;
        for(int ele:nums){
            System.out.print(ele+" ");
        }
        System.out.println();

        shifting(nums,0,nums.length-shift-1);
        for(int ele:nums){
            System.out.print(ele+" ");
        }
        System.out.println();

        shifting(nums,nums.length-shift,nums.length-1);
        for(int ele:nums){
            System.out.print(ele+" ");
        }
        System.out.println();


        shifting(nums,0,nums.length-1);
        for(int ele:nums){
            System.out.print(ele+" ");
        }

    }
    static void shifting(int nums[],int low,int high){
        while (low<high){
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;high--;
        }
    }
}
