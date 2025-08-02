class printing implements Runnable
{
    public void run()
    {
        try{
            for(int i=0;i<2;i++)
            {
                System.out.println("focus is important");
                Thread.sleep(3000);
            }
        }
        catch(Exception e){
            System.out.println("problem");
        }
        System.out.println("child thread task completed");
    }
}
public class multilaunch8 {
    public static void main(String[] args) throws Exception {
        System.out.println("main thread started");
        printing p=new printing();
        Thread t1=new Thread(p);
        System.out.println(t1.isAlive());//false
        t1.start();
        t1.join();

        System.out.println("main thread finishes the work");

    }
    
}
