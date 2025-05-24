package JavaPW.dsa;

public class Day13_BinarySearch
{
    public static void main(String[] args) {
        int arr[]={1,2,5,6,9,12,12,22,34};
        int target=34;
       int low=0,high=arr.length-1;
       int steps=0;
       while (low<=high){
           int mid=(high+low)/2;
           if(arr[mid]==target) {
               steps++;
               System.out.println("Search element : "+target+" Found at "+mid+" Position after "+steps+" steps");
               return;
           }
           else if(arr[mid]>target){
               high=mid-1;
           }
           else low=mid+1;
           steps++;
       }
        System.out.println("Search element : "+target+" Not found");

    }
}
