package JavaPW.dsa;

public class Day13_LinearSearch
{
    public static void main(String[] args) {
        int arr[]={1,2,5,6,9,12,12,22,34};
        int search=34;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search) System.out.println("Search element "+search+" found at location "+i);
        }
    }
}
