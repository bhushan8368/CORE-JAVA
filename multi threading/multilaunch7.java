class demo1 implements Runnable{
    public void run(){
        System.out.println("child thread executing");
        try{
            Thread.sleep(3000);
        }
        catch(Exception e){
            System.out.println("some pronlem");
        }
        System.out.println("child thead task completed");
    }
}
public class multilaunch7{
    public static void main(String[] args)
    {
        System.out.println("main thread");

        demo1 d=new demo1();
        Thread T1=new Thread(d);
        T1.start();
    }
}