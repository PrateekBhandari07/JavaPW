package JavaPW.threads;

class Counter {
    static int count = 0;

    synchronized void increment() {
        count++;
    }
}

class First extends Thread {
    Counter c;

    First(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Counter sharedCounter = new Counter();

        First threadOne = new First(sharedCounter);
        First threadTwo = new First(sharedCounter);

        threadOne.start();
        threadTwo.start();

        threadOne.join();  // wait for threadOne to finish
        threadTwo.join();  // wait for threadTwo to finish

        System.out.println("Final Count: " + Counter.count);
    }
}
