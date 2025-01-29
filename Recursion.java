public class Recursion
{
    public static void main(String[] args) {
//        fun(10);
        System.out.println("factorial of 5 : "+ fact(5));
    }

    private static void fun(int i) {
        System.out.println(i);
        if(i>0){
            i--;
            fun(i);

        }
    }
    public static int fact(int n){
        int factorial=1;
        if (n==1){
            return 1;
        }
        factorial=n*fact(n-1);
        return factorial;
    }
}
