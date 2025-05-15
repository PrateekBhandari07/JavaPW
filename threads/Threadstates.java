package JavaPW.threads;


class Firstt extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is in RUNNABLE state (Ready to run)");

        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is RUNNING: " + i);
            try {
                sleep(1000); // Thread moves to TIMED_WAITING state
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " is INTERRUPTED");
                throw new RuntimeException(e);
            }
        }

        System.out.println(Thread.currentThread().getName() + " is TERMINATED (STOPPED)");
    }
}

class Second extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is in RUNNABLE state (Ready to run)");

        for (int i = 11; i <= 15; i++) {
            System.out.println(Thread.currentThread().getName() + " is RUNNING: " + i);
            try {
                Thread.sleep(1000); // Thread moves to TIMED_WAITING state
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " is INTERRUPTED");
                throw new RuntimeException(e);
            }
        }

        System.out.println(Thread.currentThread().getName() + " is TERMINATED (STOPPED)");
    }
}

public class Threadstates {
    public static void main(String[] args) throws InterruptedException {
        Firstt obj = new Firstt();
        Second obj2 = new Second();
        obj.setName("FIRST THREAD");
        obj2.setName("SECOND THREAD");
        System.out.println("Thread A is in NEW (BORN) state"+obj.getState());
        System.out.println("Thread B is in NEW (BORN) state"+obj.getState());

        obj.start();
        System.out.println(Thread.currentThread().getName()+obj.getState());
        obj2.start(); // Thread moves to RUNNABLE state
        System.out.println(Thread.currentThread().getName()+obj2.getState());
        obj.join();
        obj2.join();
        System.out.println(obj.getName()+" "+obj.getState());
        System.out.println(obj2.getName()+" "+obj2.getState());


    }
}
