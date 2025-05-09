package JavaPW.dsa;

public class Day03_StringReverse
{
    public static void main(String[] args) {
        String a="Ronlado";
//        String a="RACECAR";
        String result="";
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            result=c+result;
        }
        System.out.println(result);
        if(a.equals(result)) System.out.println("palindrome");
        else System.out.println("Not a palindrome");
    }
}
