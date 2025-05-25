package JavaPW.recursion;

public class Print10to1
{
    public static void main(String[] args) {
        print(10);
    }
    static void print(int n){
        if(n<1) return;
        System.out.println(n);
        print(--n); // dont use n-- (stack overflow error)

    }
}
