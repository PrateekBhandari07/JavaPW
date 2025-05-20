package JavaPW.dsa;

public class Day10_GcdOrHcf
{
    public static void main(String[] args) {
        int a=68;
        int b=12;
        while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("GCD is : "+a);
    }
}
