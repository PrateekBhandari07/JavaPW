package JavaPW.threads;
class count{
    static int counter;
    public synchronized void increment(){
        counter++;
    }
}

class thread extends Thread{
 count c;
    thread(count c){
        this.c=c;
    }
    @Override
    public void run() {
        for(int i=0;i<20000;i++){
            c.increment();

        }
    }

}

public class race
{
    public static void main(String[] args) {
        count shared=new count();
        thread obj1=new thread(shared);
        thread obj2=new thread(shared);
        obj1.start();
        obj2.start();
        try {
            obj1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            obj2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }

        System.out.println(count.counter);
    }
}
