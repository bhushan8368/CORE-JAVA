public class multilaunch2{
    public static void main(String[] args){
        System.out.println("main thread");
        String name=Thread.currentThread().getName();
        System.out.println(name);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("after changing");
        Thread t=Thread.currentThread();
        t.setName("pw");
        t.setPriority(1);
        String name1=Thread.currentThread().getName();
        System.out.println(name1);
        System.out.println(Thread.currentThread().getPriority());
        

    
    }
}