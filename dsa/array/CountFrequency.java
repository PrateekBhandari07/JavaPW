package JavaPW.dsa.array;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency
{
    public static void main(String[] args) {

//        Solution 1: Use of two loops
//        Time complexity O(n^2)
//        Space Complexity O(n)
        int arr[]={1,2,3,1,2,1};
        boolean arr2[]=new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=1;
            if(arr2[i]==true){
                continue;
            }
            arr2[i]=true;
            for(int j=i+1;j<arr.length;j++){

                if(arr[i]==arr[j]){
                    arr2[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+" Count "+count);
        }
        System.out.println();


//        Using HashMap
//        Time complexity O(n)
//        Space Complexity o(n)
        HashMap<Integer,Integer> map=new HashMap<>(); //--> space O(n)
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }



    }
}
