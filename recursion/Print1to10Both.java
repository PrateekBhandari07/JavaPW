package JavaPW.recursion;
//In the last program we were printing numbers from 1 to 5 by making use of recursion
//Now for the same program we will use the concept of recursion
public class Print1to10Both
{
    public static void main(String[] args) {
        int n=1;
        print(n);
    }
    static  void print(int n){
        if (n>5) {
            return;
        }
        System.out.println(n);
        print(n+1);
        System.out.println(n);
    }
}
