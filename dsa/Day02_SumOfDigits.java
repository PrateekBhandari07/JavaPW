package JavaPW.dsa;

public class Day02_SumOfDigits
{
    public static void main(String[] args) {
        int n=12345;
        int length=String.valueOf(n).length();
        int result=0;
        for(int i=0;i<length;i++){
            int rem=n%10;
            result+=rem;
            n/=10;
        }
        System.out.println(result);
    }
}
