package JavaPW.recursion;

public class SumOfDigits
{
    public static void main(String[] args) {
        int n=54321;
        System.out.println("Sum of Digits : "+sumOfDigits(n));
        System.out.println("Product of Digits : "+productOfDigits(n));
    }
    static int sumOfDigits(int n){
        if(n==0) return n;
        return n%10+sumOfDigits(n/10);
    }
    static int productOfDigits(int n){
        if(n==0) return 1;
        return n%10*productOfDigits(n/10);
    }
}
