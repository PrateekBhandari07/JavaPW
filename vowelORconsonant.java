import java.util.Scanner;
// Java program to check whether entered character is vowel or consonant
public class vowelORconsonant
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char letter=sc.next().charAt(0);
        System.out.print("Decimal value of the character "+letter+" : ");
        System.out.print((int)letter);
        letter=Character.toLowerCase(letter);
//        if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
//            System.out.println("Vowel");
//        }
//        else if (letter>'a' && letter<='z'){
//            System.out.println("consonant");
//        }
//        else System.out.println("Invalid character");
    }
}
