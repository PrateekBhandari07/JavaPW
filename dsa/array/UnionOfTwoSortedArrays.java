package JavaPW.dsa.array;

import java.util.*;

public class UnionOfTwoSortedArrays
{
    public static void main(String[] args) {


        int arr1[]={1,1,2,2,4,5,9,10,55};
        int arr2[]={2,3,4,4,5,6,7};

//        Approach 1 using Hashset
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){    // O(n)
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){     // O(m)
            set.add(arr2[i]);
        }
        ArrayList<Integer> li=new ArrayList<>(set);  // O(n+m)
        Collections.sort(li);                       // O((n+m) log (n+m))
        System.out.println(li);
        // time complexity O((n+m) log (n+m)) dominating term
        // space complexity O(n+m)


        //        Approach 2 using TreeSet
        System.out.println("Approach 2");
        TreeSet<Integer> tset=new TreeSet<>();
        for(int i=0;i<arr1.length;i++){    // O(nlogn)
            tset.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){     // O(m log (n+m))
            tset.add(arr2[i]);
        }
        System.out.println(tset);   // final time complexity O(m log (n+m))
                                    // space complexity O(n+m)


        System.out.println("Optimal approach");
        System.out.println("Two pointer approach");
        int a[]={1,1,1,2,3,3,4,5,55};
        int b[]={2,5,6,7};
        int p1=0,p2=0;
        ArrayList<Integer> union=new ArrayList<>();
        while (p1<a.length && p2<b.length){
            if(a[p1]<=b[p2]){
               if(union.isEmpty() || union.get(union.size() -1 )!=a[p1]){
                   union.add(a[p1]);

               }
                p1++;
            }
            else {
              if(union.isEmpty() || union.get(union.size()-1)!=b[p2]){
                  union.add(b[p2]);
              }
                p2++;
            }

        }

        while (p1 < a.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != a[p1])
                union.add(a[p1]);
            p1++;
        }
        while (p2 < b.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != b[p2])
                union.add(b[p2]);
            p2++;
        }

        System.out.println(union); // time complexity O(m+n)
                                    // space(1)  and 0(m+n) output space not computing
    }
}
