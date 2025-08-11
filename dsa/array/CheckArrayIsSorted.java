package JavaPW.dsa.array;
//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,5,6,7,7};
        int arr2[]={1,2,1,3,4};
        System.out.println(sorted(arr));
        System.out.println(sorted(arr2));

//  sorted and rotated
        int nums[]={3,5,6,9,1,2};
        System.out.println("Sorted rotated array " +rotated(nums));

    }
    static boolean sorted(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    static boolean rotated(int arr[]){
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                count++;
            }
        }
        if(arr[arr.length-1]>arr[0]) {
            count++;
        }
        return count<=1;
    }
}
