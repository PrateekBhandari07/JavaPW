package JavaPW.threads;
class YieldThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){

            System.out.println(Thread.currentThread().getName()+":"+i);
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+"THread got interrupted");
            }

            Thread.yield();
        }
    }
}
public class Yield {
    public static void main(String[] args) {
        YieldThread y=new YieldThread();
        YieldThread y2=new YieldThread();
        y.start();
        y2.start();
        y.interrupt();
    }
}
//Pauses the current thread and allows other threads of the same priority to execute.
//Use Case: Used to give other threads a chance to run.