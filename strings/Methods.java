package strings;

public class Methods
{
    public static void main(String[] args) {
        String First=" Prateek ";
        String last=" Bhandari ";
        String f=" Prateek ";
        //length
        System.out.println(First.length());//9
        //charAt
        System.out.println(First.charAt(1));//P
        //substring
        System.out.println(First.substring(0,8));// Prateek
        System.out.println(First.substring(5));//eek
        //uppercase
        System.out.println(First.toUpperCase());// PRATEEK
        //lowercase
        System.out.println(First.toLowerCase());// prateek
        //time trialing and ending spaces
        System.out.println(First.trim());//Prateek
        //equals/Ignore Case
        System.out.println(f+First);// Prateek  Prateek
        System.out.println("Equals : "+First.trim().equals(f.trim()));//Equals : true
        System.out.println("Ignore case : "+First.trim().equalsIgnoreCase(f.trim()));//Ignore case : true
        //contains
        System.out.println(First.contains("P"));//true
        //indexof
        System.out.println(First.indexOf('e'));//5
        System.out.println(First);// Prateek
        //replace e with h
        System.out.println(First.replace('e','h'));// Prathhk
        //last index
        System.out.println(First.indexOf('e'));//5
        System.out.println(First.lastIndexOf('e'));//6

    }
}
