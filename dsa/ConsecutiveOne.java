package JavaPW.dsa;

public class ConsecutiveOne
{
    public static void main(String[] args) {
        int arr[]={1,0,1,1,0,1,1,1,0,1,1,1,1,1,0,1,1,1,1};
        int couter=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                couter++;
                max=Math.max(couter,max);
            }
            else {
                couter=0;
            }
        }
        System.out.println("Maximum sequence of one : "+max);
    }
}
