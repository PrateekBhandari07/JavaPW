package JavaPW.dsa.array;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,3,6,2,7,9,5,3};
        int target=17;
        if(search(arr,target)){
            System.out.println("Element Found");
        }else System.out.println("Element Not Found");
    }
    public static boolean search(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return true;
            }
        }
        return false;

    }
}
