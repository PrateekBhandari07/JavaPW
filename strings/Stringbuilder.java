package strings;

public class Stringbuilder
{
    public static void main(String[] args) {
        StringBuilder ob=new StringBuilder("Prateek");
        System.out.println(ob);//Prateek
        ob.append(" Bhandari");
        System.out.println(ob);//Prateek Bhandari
        ob.delete(0,ob.length());
        ob.append("Akshay Kumar");
        System.out.println(ob);//Akshay Kumar
        ob.insert(6," Rahul ");
        System.out.println(ob);//Akshay Rahul  Kumar
        ob.replace(7,12,"singh");
        System.out.println(ob);//Akshay singh  Kumar
        System.out.println(ob.reverse());//ramuK  hgnis yahskA

        String a=new String("hello");
        String b="hello";
        System.out.println(a.hashCode());
        System.out.println(System.identityHashCode(a));
        a.concat("hi");
        System.out.println(a);

        StringBuilder x=new StringBuilder("hi");
        System.out.println(System.identityHashCode(x));
        x.append("ji");
        System.out.println(System.identityHashCode(x));
        System.out.println(x);

    }
}
