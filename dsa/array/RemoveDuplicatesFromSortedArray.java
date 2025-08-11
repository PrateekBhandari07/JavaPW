package JavaPW.dsa.array;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
import java.util.HashSet;
import java.util.TreeSet;
//task is to remove duplicates from array and return total unique elements
public class RemoveDuplicatesFromSortedArray
{
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,4,5};
        System.out.println("\nBrute Force Approach");
        int n=totalUnique(arr);
        System.out.println("\nTotal unique elements : ");
        System.out.println(n);
//        time complexity O(n log n)+O(n) -- > O(n)
//        space complexity O(n)


//        Optimal approach
        System.out.println("Optimal approach"); // time complexity O(n)
        int arr2[]={1,1,2,2,3};
        int cc=opti(arr2);
        System.out.println("\ntotal unique elements "+cc);
    }
    static int opti(int arr2[]){
        int index=0;
        for(int i=0;i<arr2.length;i++){
            if(arr2[index]!=arr2[i]){
                index++;
                arr2[index]=arr2[i];
            }
        }
        for(int ele:arr2){
            System.out.print(ele+" ");
        }
        return ++index;
    }
    static int totalUnique(int arr[]){
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);  // n log n
        }
        int index=0;
        for(Integer num:set){
            arr[index]=num; // n
            index++;
        }

        for(int ele:arr){
            System.out.print(ele+" ");
        }
        return index;
    }
}
