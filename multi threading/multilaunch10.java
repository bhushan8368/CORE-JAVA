class car implements Runnable{
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName() +"has entered the parking lot");
            Thread.sleep(3000);
            
            synchronized(this)
            {
                System.out.println(Thread.currentThread().getName() +"got into the car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() +"started to drivethe car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() +"came back and parked the car");
                Thread.sleep(2000);
            }
        }
        catch(Exception e){
            System.out.println("SOME PROBLEM");
        }

    }
}
public class multilaunch10 {
    public static void main(String[] args) {
        car c=new car();
        
        Thread t1=new Thread(c);
        Thread t2=new Thread(c);
        Thread t3=new Thread(c);
        t1.start();
        t2.start();
        t3.start();

    }
    
}
