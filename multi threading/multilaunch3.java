class mythread extends Thread{
    public void run(){
        System.out.println("child thread");
    }
}

public class multilaunch3{
    public static void main(String[] args){
        System.out.println("main thread");
        mythread t=new mythread();
        t.start();

    }
}