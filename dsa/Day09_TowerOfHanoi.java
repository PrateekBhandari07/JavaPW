package JavaPW.dsa;

public class Day09_TowerOfHanoi
{
    static void tower(int n,int a,int b,int c){
        if (n==1){
            System.out.println("move "+n+" from "+a+" to "+c);
            return;
        }
        tower(n-1,a,c,b);
        System.out.println("move "+(n)+" from "+a+" to "+c);
        tower(n-1,b,a,c);

    }
    public static void main(String[] args) {
        int n=3;
        tower(n,1,2,3);
    }
}
