import java.util.Scanner;

public class BinarySearch
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements : ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered elements are : ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println("\nEnter the element to search");
        int search=sc.nextInt();
        int first=0,last=arr.length-1;

        while (first<=last){
            int mid=(first+last)/2;
            if(arr[mid]==search){
                System.out.println("Search element " +arr[mid]+" found " );
                break;
            } else if (arr[mid]>search) {
                last=mid-1;
            }
            else {
                first=mid+1;
            }

        }
        if(first>last){
            System.out.println("Search element not found ");
        }

    }
}
