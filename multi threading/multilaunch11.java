class Library implements Runnable {
    String res1 = new String("Java");
    String res2 = new String("DSA");
    String res3 = new String("SQL");

    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("student1")) {
            try {
                Thread.sleep(3000);
                synchronized (res1) {
                    System.out.println(name + " has accessed " + res1);
                    Thread.sleep(3000);
                    synchronized (res2) {
                        System.out.println(name + " has accessed " + res2);
                        Thread.sleep(3000);
                        synchronized (res3) {
                            System.out.println(name + " has accessed " + res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("some problem");
            }
        } 
        else if (name.equals("student2")) {
            try {
                Thread.sleep(3000);
                synchronized (res3) {
                    System.out.println(name + " has accessed " + res3);
                    Thread.sleep(3000);
                    synchronized (res2) {
                        System.out.println(name + " has accessed " + res2);
                        Thread.sleep(3000);
                        synchronized (res1) {
                            System.out.println(name + " has accessed " + res1);
                            Thread.sleep(3000);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("some problem");
            }
        }
    }
}
public class multilaunch11 {
    public static void main(String[] args) {
        Library lib = new Library(); // Shared library
        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);

        t1.setName("student1");
        t2.setName("student2");

        t1.start();
        t2.start();
    }
}

