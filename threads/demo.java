package JavaPW.threads;

public class demo {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();

        System.out.println(t.isAlive());
        t.setName("Demo Thread");
        System.out.println(t.getName());
    }
}
