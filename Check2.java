import java.util.Scanner;

public class Check2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt(),b=sc.nextInt();
            String x=sc.next(),y=sc.next();
            boolean check=true;
            if(a>b){
                for(int i=0;i<a;i++){
                    for(int j=0;j<b;j++){
                        if(x.charAt(i)==y.charAt(j)){
                            System.out.println(x.charAt(i)+" "+y.charAt(j));
                            check=false;
                            break;
                        }
                    }

                }
                if(check ) System.out.println("YES");
                else System.out.println("NO");

            }
        }

    }
}
