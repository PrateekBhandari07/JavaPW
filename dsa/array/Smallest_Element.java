package JavaPW.dsa.array;

import java.util.Arrays;

public class Smallest_Element
{
    public static void main(String[] args) {
        int arr[]={4,7,2,1,8,0};
        int min=arr[0];

        //approach 1
        for(int i=1;i<arr.length;i++){ //O(n)
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("MIN : "+min);


//        approach2 : sort the array and print first element
        Arrays.sort(arr);
        System.out.println("Min using sorting : "+arr[0]); //O(nlogn)



        //same goes for finding largest element arrays
    }
}
