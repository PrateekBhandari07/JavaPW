package JavaPW.dsa;

public class Day10_LCM
{
    public static void main(String[] args) {
        int a=3;
        int b=28;
        int gcd=findLcm(a,b);
        int lcm=(a*b)/gcd;
        System.out.println("GCD : "+gcd);
        System.out.println("LCM : "+lcm);
    }
    static int findLcm(int a,int b){
        while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
