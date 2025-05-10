package JavaPW.dsa;
//input  arr-->1,2,3,4,5
//result   arr-->2,3,4,5,1
public class Day04_ArrayShift
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length-1;i++){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int ele:arr){
            System.out.print(ele+ " ");
        }
    }
}
