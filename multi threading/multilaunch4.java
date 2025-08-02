import java.util.*;
class calc extends Thread{
    public void run() {
    System.out.println("calculation task started");

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    int num1=sc.nextInt();
    System.out.println("please enter 2nd no");
    int num2=sc.nextInt();
    int res=num1+num2;
    System.out.println(res);

    System.out.println("calculation ended");
    System.out.println("********************");

    }
}
class message extends Thread{
public void run(){
    System.out.println("message task started");
    try{  
        for(int i=0;i<3;i++){
        System.out.println("message sent");
        //Thread.sleep(2000);
    }
}
    catch(Exception e){System.out.println("error in sending message");}


  
    System.out.println("message task ended");

}}

public class multilaunch4{
    public static void main(String[] args){
        System.out.println("main thread");
        calc c=new calc();
        message mess=new message();
        c.start();
        mess.start();
        

    }
}