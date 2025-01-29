package strings;

public class Capacity_of_String
{
    public static void main(String[] args) {
        StringBuffer a=new StringBuffer();
        System.out.println(a.capacity());//16
        a.append("0123456789123456");
        System.out.println(a.capacity());//16
        a.append("7");
        System.out.println(a.capacity());//34
    }
}
