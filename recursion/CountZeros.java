package JavaPW.recursion;

public class CountZeros
{
    public static void main(String[] args) {
//      By using external variable
        int n=3001;
//        count(n);
//        System.out.println(counter);

//      Second approach
        System.out.println(approach2(n));
    }
    static int counter=0;
    static void count(int n){
        if(n==0) return ;
        int rev=n%10;
        if(rev==0) counter++;
        count(n/10);
    }

    //    variable within argument
    static int  approach2(int n){
        return helper(n,0);
    }
    static int helper(int n,int c){
        if(n==0) return c;
        int rem=n%10;
        if(rem==0) return helper(n/10,c+1);
        return helper(n/10,c);
    }


}
