package JavaPW.dsa.array;

import java.util.ArrayList;

public class MovingZerosToEnd {
    public static void main(String[] args) {
        System.out.println("Approach 1");
//        Approach 1 Time Complexity O(n)
//                   Space Complexity O(n)
        int arr[]={1,0,4,9,0,3,0,0,0,2};
        int updatedArray[]=new int[arr.length];

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) {
                updatedArray[count]=arr[i];
                count++;
            }
        }
        for(int ele:updatedArray){
            System.out.print(ele+" ");
        }


        System.out.println("\nApproach 2");
//        Approach 2
//        Time Complexity O(n)+O(d)+O(n-d) = O(2*n) --> O(n)
//        Space Complexity O(d) d--> number of non zero element
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        for(int i=0;i<temp.size();i++){
            arr[i]= temp.get(i);
        }
        for(int i=temp.size();i<arr.length;i++){
            arr[i]=0;
        }
        for(int ele:updatedArray){
            System.out.print(ele+" ");
        }


//        Approach 3
//        Here’s the two-pointer approach to move all
//        zeros to the end while keeping the order of non-zero elements intact:
        System.out.println("\n\nOptimal Approach");    //time complexity O(n)
        int nums[]={1,0,2,3,2,0,3,0,4,5,1,0};          //space complexity O(1)
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=0){
                int tempo=nums[right];
                nums[right]=nums[left];
                nums[left]=tempo;
                left++;
            }
        }
        for(int ele: nums){
            System.out.print(ele+" ");
        }
    }
}
