package JavaPW.dsa;

public class Day05_PalindromeString
{
    public static void main(String[] args) {
        String s="RACECAR";
//        brute force approach
        int len=s.length();
        int first=0,last=len-1;
//        while (first<=last){
//            if(s.charAt(first)==s.charAt(last)){
//                System.out.println(first+" and "+last+" matched");
//                first++;
//                last--;
//            }
//            else {
//                System.out.println("It is not a palindrome");
//                return;
//            }
//        }
//        System.out.println("Palindrome");

//        Two pointer algorithm
        while (first<=last){
            if(s.charAt(first)!=s.charAt(last)){
                System.out.println("Not a palindrome");
                return;
            }
            first++;
            last--;
        }
        System.out.println("Palindrome");
    }
}
