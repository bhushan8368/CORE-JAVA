import java.util.*;

class mythread1 extends Thread {
    public void run() {
        String tname = Thread.currentThread().getName();
        if (tname.equals("calc")) {
            calc();
        } else {
            importantmsg();
        }
    }

    public void calc() {
        System.out.println("Calculation task started");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Please enter 2nd number");
        int num2 = sc.nextInt();
        int res = num1 + num2;
        System.out.println("Result: " + res);

        System.out.println("Calculation ended");
        System.out.println("********************");
    }

    public void importantmsg() {
        System.out.println("Message task started");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Message sent");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Error in sending message");
        }

        System.out.println("Message task ended");
    }
}

public class multilaunch6 {
    public static void main(String[] args) {
        mythread1 thread1 = new mythread1();
        mythread1 thread2 = new mythread1();

        thread1.setName("calc");
        thread2.setName("print");

        thread1.start();
        thread2.start();
    }
}
