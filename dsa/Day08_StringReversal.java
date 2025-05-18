package JavaPW.dsa;
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
// and removing all non-alphanumeric characters, it reads the same forward and backward.
// Alphanumeric characters include letters and numbers.
public class Day08_StringReversal
{
    public static void main(String[] args) {
//        String s="A man, a plan, a canal: Panama";
//        String s="a.@";
//        String s="0p";
        String s="ab_a";
        System.out.println(checkPalindrome(s));
    }
    static boolean checkPalindrome(String s){
//        String result=s.replaceAll("[ ,:@//.]","").toLowerCase();
        // Remove all non-alphanumeric characters and convert to lowercase
        String result=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder rev=new StringBuilder(result).reverse();
        String reverse=String.valueOf(rev);
        System.out.println(reverse+"\n"+rev);
        if(result.equals(reverse)) return true;
        else return false;
    }
}
