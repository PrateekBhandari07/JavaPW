package JavaPW.dsa;

public class Day01_Palindrome
{
    public static void main(String[] args) {
        int number=1441;
        int temp=number;
        int result=0;
        while (temp!=0){
            int rem=temp%10;
            result=result*10+rem;
            temp/=10;
        }
        if(result==number) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }
}
