package certification.java11.threads;

class Resource {
    Worker owner;
    synchronized boolean claim(Worker w) {
        if (owner == null) {
            owner = w;
            return true;
        }
        else return false;
    }
    synchronized void release() {
        owner = null;
    }
}
class Worker {
    synchronized void work(Resource... resources) {
        try {
            //for (int i = 0; i < 10; i++) {
                while (!resources[0].claim(this)) {
                    System.out.printf("worker %s trying to claim resource 0%n",
                            String.valueOf(Thread.currentThread().getId()));
                }
                Thread.sleep(1000);
                while (!resources[1].claim(this)) {
                    System.out.printf("worker %s trying to claim resource 1%n",
                            String.valueOf(Thread.currentThread().getId()));
                }
                //do work with resource
                Thread.sleep(1000);
                resources[0].release();
                resources[1].release();
            //}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class LiveLock {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        Worker w2 = new Worker();
        Resource r1 = new Resource();
        Resource r2 = new Resource();
        Thread t1 = new Thread(
                () -> w1.work(r1, r2)
        );
        Thread t2 = new Thread(
                () -> w2.work(r2, r1)
        );
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
