package JavaPW.dsa.array;

public class LeftRotateByOne
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

//        Approach1 by swapping
        for(int i=0;i<arr.length-1;i++){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int ele:arr){
            System.out.print(ele +" ");
        }
        System.out.println("\nApproach 2");
//        Approach 2 moving each element by -1
        int t=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=t;
        for(int ele:arr){
            System.out.print(ele+" ");
        }
       // Summary Table:

       // Approach   	   Time Complexity	Space Complexity	Practical Performance
       // Swapping	             O(n)	        O(1)	           Slower (more swaps)
        //Shifting (Optimal)	 O(n)	        O(1)	           Faster (single shift)
    }
}
