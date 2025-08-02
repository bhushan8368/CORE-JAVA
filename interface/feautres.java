interface a{
    void show();
    default void config(){
        System.out.println("in config");

    }
    static void abc(){
        System.out.println("in abc");
    }
}
class b implements a{
    public void show(){
        System.out.println("in show");
    }
}
public class feautres{
    public static void main(String[] args){
        a.abc();
        a obj =new b();
        obj.show();



    }
}