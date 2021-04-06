package certification.java11.threads;

public class Sleep {
    public static class SleepTask implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(10000);
                System.out.println("No InterruptedException thrown");
            } catch (InterruptedException e) {
                System.out.println("InterruptedException thrown");
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        var thread = new Thread(new SleepTask());
        thread.start();
        thread.interrupt();
        System.out.println("Is Interrupted: " + thread.isInterrupted());
    }
}
