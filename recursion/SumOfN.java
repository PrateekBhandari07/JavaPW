package JavaPW.recursion;

public class SumOfN {
    public static void main(String[] args) {
        int n=6;
        int s=(n*(n+1))/2;
        System.out.println(s);
        System.out.println(sum(n));
        System.out.println("Product"+product(n));
    }
    static int  sum(int n){
        if(n==1) return n;
        return n+sum(n-1);
    }
    static int product(int n){
        if(n==1) return n;
        return n*sum(n-1);
    }
}
