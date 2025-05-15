package JavaPW.threads;
    class JoinThread extends Thread{
        @Override
        public void run() {
            for(int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+":"+i);
                try{
                    Thread.sleep(20);
                }
                catch (InterruptedException e){
                    System.out.println(e);
                }
            }
        }
    }
public class Join {
    public static void main(String[] args) {
        JoinThread j=new JoinThread();
        JoinThread j2=new JoinThread();
        j.start();
        j2.start();
        try {
            j2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        when ever the chance gets j2 will execute completely

    }
}
//join() will execute the current thread completely and gives chance for other thread
//Purpose: Waits for the thread to die (i.e., for the thread to finish its execution).
//Use Case: Used to ensure that one thread waits for another thread to complete.