package JavaPW.Exception;

public class Finally
{
    public static void main(String[] args) {
        int a=10,b=0;
        try{
            System.out.println("Division");
            System.out.println(a/b);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Denominator Cannot be zero");
        }
        finally {
            System.out.println("Executed always");
        }
    }
}
