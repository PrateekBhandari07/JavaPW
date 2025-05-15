package JavaPW.dsa;

public class Day07_MissingNumber {
    public static void main(String[] args) {

//        for(int i=1;i<=arr.length;i++){
//            boolean flag=false;
//            for(int j=0;j<arr.length;j++){
//                if(i==arr[j]){
//                    flag=true;
//                    break;
//                }
//
//            }
//            if(!flag) System.out.println(i);
//        }
        int arr[]={1,5,2,7,3,4};
        int arr2[]=new int[(arr.length+2)];
        for(int i=1;i<arr2.length-1;i++){
//            System.out.print(arr2[i]);
            arr2[arr[i-1]]=arr[i-1];
//            System.out.println(arr[i-1]+" " +arr2[arr[i-1]]);
        }
        for(int i=1;i<arr2.length-1;i++){
            if(arr2[i]==0){
                System.out.println(i);
                return;
            }
        }

    }
}
