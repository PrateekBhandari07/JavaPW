import java.util.Arrays;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a="hello";
        System.out.println(a);
        System.out.println(System.identityHashCode(a));
        a=a+"world";
        System.out.println(a);
        System.out.println(System.identityHashCode(a));

        StringBuffer b=new StringBuffer("Prateek");
        System.out.println(b);
        System.out.println(System.identityHashCode(b));
        b.append("Bhandari");
        System.out.println(b);
        System.out.println(System.identityHashCode(b));

        int income=sc.nextInt(),amount=sc.nextInt(),limit=sc.nextInt();
        int count=0;
        while(!((income*amount)<=(limit))){
            income--;
            count++;
        }
        System.out.println(count);

    }
}
