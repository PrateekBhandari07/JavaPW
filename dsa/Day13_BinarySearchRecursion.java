package JavaPW.dsa;

public class Day13_BinarySearchRecursion
{
    public static void main(String[] args) {
        int arr[]={1,4,5,7,8,9,11,21,23,34};
        int low=0;
        int high=arr.length-1;
        int target=1;
        search(arr,low,high,target);

    }
    static void search(int arr[],int low,int high,int target){

        if(low>high){
            System.out.println("element "+target+" not found");
            return;
        }
        int mid=(low+high)/2;
        if(arr[mid]==target){
            System.out.println("element "+target+" found at location "+mid);
            return;
        }
        if(target<arr[mid]) {
            high = mid - 1;
            search(arr,low,high,target);

        }
        else{
            low=mid+1;
            search(arr,low,high,target);

        }
    }

}
