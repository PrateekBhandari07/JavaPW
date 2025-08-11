package JavaPW.dsa.array;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArrays
{
    public static void main(String[] args) {
        int arr1[]={1,2,3,3,4,5,6,8};
        int arr2[]={1,3,3,4,7,8};
        ArrayList<Integer> list=new ArrayList<>();

        boolean vistied[]=new boolean[arr2.length];
//        for(int i=0;i<arr1.length;i++){
//            for(int j=0;i<arr2.length;j++){
//
//            }
//        }
        int i=0,j=0;
        while (i<arr1.length&& j<arr2.length){

            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                list.add(arr1[i]);
                i++;j++;

            }

        }
        System.out.println(list);
    }
}
