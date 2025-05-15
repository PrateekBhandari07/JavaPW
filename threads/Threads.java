package JavaPW.threads;
class MyRunnable implements Runnable {
    public void run() {  // Overriding run() method
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

class Threading extends Thread{
//    Threading(String name){
//        super(name);
//    }
    public void run(){
        for(int i=10;i<15;i++){
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Threading th=new Threading();
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(th);

        t1.start();  // Start first thread
        t2.start();  // Start second thread

//        Threading t3=new Threading("first");
//        Threading t4=new Threading("second");
//        t3.start();
//        t4.start();
    }
}

