import java.util.Arrays;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[2];
        for(int i=0;i<2;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[0]+" "+arr[1]);
        float res=(float) ((arr[1])/(float)(arr[0]));
        System.out.println(res);
        boolean b=true;
        while (b){
            int count=1;
            while(count<=res){
                if(count==res){
                    System.out.println("YES");
                    b=false;
                    System.exit(0);
                }
                else {
                    count=count*2;
                }

            }
            System.out.println("No");
            System.exit(0);
        }
    }
}
