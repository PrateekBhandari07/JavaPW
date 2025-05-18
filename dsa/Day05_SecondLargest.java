package JavaPW.dsa;
public class Day05_SecondLargest
{
    public static void main(String[] args) {
        int arr[]={5,5,2,5,2,1};
        int firstLargest=arr[0];
        int secondLargest=Integer.MIN_VALUE;
        if(arr.length<2){
            System.out.println("Array has only one element");
            return;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]>firstLargest){
                secondLargest=firstLargest;
                firstLargest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=firstLargest){
                secondLargest=arr[i];
            }
        }
        if(firstLargest==Integer.MIN_VALUE){
            System.out.println("Array is filled with same value");
        }
        else{
            System.out.println("First Largest : "+firstLargest);
            System.out.println("Second Largest : "+secondLargest);
        }
    }
}
