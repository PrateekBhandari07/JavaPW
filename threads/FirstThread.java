package JavaPW.threads;

import static java.lang.Thread.sleep;

class A extends Thread{
    public void run(){
        for(int i=1;i<=10;i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
class B extends Thread{
    public void run(){
        for(int i=11;i<20;i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
public class FirstThread
{
    public static void main(String[] args) {
        A obj=new A();
        B obj2=new B();
        obj.start();

        obj2.start();


    }
}
