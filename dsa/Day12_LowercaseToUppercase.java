package JavaPW.dsa;
// A-Z  65-91
// a-z  97-122
public class Day12_LowercaseToUppercase
{
    public static void main(String[] args) {
       String a="hellO";

        System.out.println(a.toUpperCase());
        a=a.toUpperCase();
        System.out.println(a);


        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(c>97){
                System.out.print(((char)(c-32)));
            }
            else {
                System.out.print(c);
            }

        }
    }
}
