class example implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Focus is important");
                Thread.sleep(1000);  // makes it interruptible
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }
}

public class multilaunch9 {
    public static void main(String[] args) {
        example ex = new example();
        Thread T1 = new Thread(ex);
        T1.start();
        T1.interrupt(); // sends interrupt signal
    }
}


