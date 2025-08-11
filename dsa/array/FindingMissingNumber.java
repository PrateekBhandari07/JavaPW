package JavaPW.dsa.array;
//https://leetcode.com/problems/missing-number/
public class FindingMissingNumber {
    public static void main(String[] args) {
        int arr[]={3,1,2};

//        brute
        System.out.println("Brute force approach");
        int res=brute(arr);
        System.out.println(res);


//        int n=check(arr);
//        System.out.println(n);
    }
    static int check(int arr[]){
        boolean present[]=new boolean[arr.length+1];
        for(int i=0;i<arr.length;i++){
            present[arr[i]]=true;
        }
        for(int i=0;i<arr.length;i++){
            if(!present[i]){
                System.out.println(i);
                return i;
            }
        }
        return arr.length;
    }
    static int brute(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean found =false;
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                    found =true;
                }
            }
            if(!found) return i;

        }
        return arr.length;

    }
}
