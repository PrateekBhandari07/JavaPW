package JavaPW.threads;
class SleepThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Sleep
{
    public static void main(String[] args) {
        SleepThread s=new SleepThread();
        s.start();
    }
}
