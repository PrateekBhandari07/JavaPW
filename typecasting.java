public class typecasting
{
    public static void main(String[] args) {
        int a=200;
        long b=a; // implicit type casting
        byte d= (byte) b; // explicit type casting
        System.out.println("implicit type casting : "+b);
        System.out.println("explicit type casting : "+d+"\n");

        System.out.println("Truncation");
        int first=10,second=7;
        float result1=first/second;
        float result2=(float) first/second;
        System.out.println(result1+"\n"+result2);
    }
}
