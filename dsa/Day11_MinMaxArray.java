package JavaPW.dsa;
//Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
// Then print the respective minimum and maximum values as a single line of two space-separated long integers.
public class Day11_MinMaxArray
{
    public static void main(String[] args) {
        int arr[]={1,3,2,1,4,2,6,3,0};
        int min=arr[0],max=arr[0],total=arr[0];
        for(int i=1;i<arr.length;i++){
            total+=arr[i];
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];
        }
        System.out.println("Minimum Value : "+(total-max));
        System.out.println("Maximum Value : "+(total-min));
    }
}
