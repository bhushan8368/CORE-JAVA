interface a{
    void show();

}
interface x{
    void abc();
}
class b implements a,x{
    public void show(){
        System.out.println("in show");
    }
    public void abc(){
        System.out.println("in abc");
    }
}
public class implementation{
    public static void main(String[] args){
        b obj=new b();
        obj.show();
        obj.abc();


    }
}