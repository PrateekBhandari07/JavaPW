package JavaPW.dsa;

public class Day04_Factorial
{
    public static void main(String[] args) {
        int n=5;
//        int result=1;
//        for(int i=1;i<=n;i++){
//            result=result*i;
//
//        }
//        System.out.println(result);
        System.out.println(factorial(5));
    }
    static int factorial(int n){
        int result=1;
        if(n==1) return 1;
        else {
           result=n*factorial(n-1);
            return result;
        }
    }
}
