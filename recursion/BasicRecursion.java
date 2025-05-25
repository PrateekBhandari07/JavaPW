package JavaPW.recursion;
//write a program to print hello 5 time by calling single function
public class BasicRecursion
{
    public static void main(String[] args) {
        print();
    }
    static void print(){
        System.out.println("hell  of print 0");
        print1();
    }
    static void print1(){
        System.out.println("hell  of print 1");
        print2();
    }
    static void print2(){
        System.out.println("hell  of print 2");
        print3();
    }
    static void print3(){
        System.out.println("hell  of print 3");
        print4();
    }
    static void print4(){
        System.out.println("hell  of print 4");

    }
}
