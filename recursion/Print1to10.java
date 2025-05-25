package JavaPW.recursion;

public class Print1to10 {
    public static void main(String[] args) {
        print(10);
    }
    static void print(int n){
        if(n<1) return;

        print(n-1);
        System.out.println(n);

    }
}
