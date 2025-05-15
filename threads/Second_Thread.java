package JavaPW.threads;
class MyThread extends Thread{
     public void run(){
        for(int i=0;i<30;i++){
            System.out.println(i+"--------");
            try{
                Thread.sleep(20);
            }
            catch (InterruptedException e){
                System.out.println("Interrupted exception");
            }
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for(int i=0;i<30;i++){
            System.out.println("hi\"java\"");
            try{
                Thread.sleep(20);
            }
            catch (InterruptedException e){
                System.out.println("Interrupted exception");
            }
            Thread.yield();
        }
    }
}
public class Second_Thread
{
    public static void main(String[] args) {
        MyThread obj=new MyThread();
        MyThread2 obj2=new MyThread2();
        obj.start();
//        obj.interrupt();
        obj2.start();
        try{
            obj.interrupt();
            obj.join();
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        try{
            obj2.interrupt();
            obj2.join();

        }
        catch (InterruptedException e){
            System.out.println(e);
        }

    }
}
