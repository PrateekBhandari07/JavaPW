package strings;
public class Strings
{ public static void main(String[] args) {
        String a="prateek";
        String b="prateek";
        String c=new String("prateek");
        String cd=new String("prateek");
        int d=100,e=100;
        int f=1000,g=1000;
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(b==c);
        System.out.println(b.equals(c));
//        checking the address of string and int variables
        System.out.println("a : "+System.identityHashCode(a));
        a="prateekbhandari";
        System.out.println("a modified : "+System.identityHashCode(a));
        System.out.println("b : "+System.identityHashCode(b));
        System.out.println("c : "+System.identityHashCode(c));
        System.out.println("cd : "+System.identityHashCode(cd));
        System.out.println("1000 : "+System.identityHashCode(d));
        System.out.println("1000 : "+System.identityHashCode(e));
        System.out.println("100 : "+System.identityHashCode(f));
        System.out.println("100 : "+System.identityHashCode(g));

        StringBuilder build1=new StringBuilder("prateek");
        StringBuilder build2=new StringBuilder("prateek");
        System.out.println("build1 : "+System.identityHashCode(build1)); //build1 : 317574433
        System.out.println("build2 : "+System.identityHashCode(build2)); //build2 : 885284298
        System.out.println(build1==build2); //false
        System.out.println(build1.equals(build2));//false
        System.out.println(build1.toString().equals(build2.toString()));//true

        String x=new String("pw");
        x.concat("skills");
        System.out.println(x);//pw
        x=x.concat("skills");
        System.out.println(x);//pwskills

        String y="my";
        System.out.println(System.identityHashCode(y));
        y+=" name ";
        System.out.println(System.identityHashCode(y));

        System.out.println(y);




    }
}
