public class Bitwise
{
    public static void main(String[] args) {
        int a=5,b=5,c=5,d=5,e=5,f=5;
        System.out.println("Bitwise AND : "+(a&3));//0101&0011
        System.out.println("Bitwise OR : "+(b|3));//0101|0011
        System.out.println("Bitwise XOR : "+(c^3));//0101^0011
        System.out.println("Bitwise Complement : "+~d);//~0101 ==>add 1 to 0101
        System.out.println("Leftshift : "+(e<<2));//101==>10100 ie 20
        System.out.println("Rightshift : "+(f>>2));//101==>1 ie 1
//      writing a binary number by user(using 0b)
        int g=0b010101;
        System.out.println(g+0b101);//21+5
    }
}
