package strings;

public class String_mutable
{
    public static void main(String[] args) {
        StringBuilder a=new StringBuilder("Prateek");
        System.out.println(a);//Prateek
        System.out.println(System.identityHashCode(a));//1329552164
        a.append(" Bhandari");
        System.out.println(System.identityHashCode(a));//1329552164
        System.out.println(a);//Prateek Bhandari
        a=new StringBuilder("giri");
        System.out.println(a);//giri
        System.out.println(System.identityHashCode(a));//363771819

        final StringBuilder b=new StringBuilder("Prateek");
        System.out.println(b);//Prateek
        b.append(" Bhandari");//Prateek Bhandari
        System.out.println(b);
//        b=new StringBuilder("giri");//error


    }
}
