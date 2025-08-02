class demo1{
    int a,b;

    public demo1(){
        System.out.println("parent class contructor");
    }
    public demo1(int x,int y){
        a=x;
        b=y;
    }   

}
class demo2 extends demo1{
    int m,n;

    public demo2(){
        super();
        System.out.println("child class constructor");
    }
    public demo2(int x ,int y){
        System.out.println("parameterized child construtor");
        m=x;
        n=y;

    }
}
public class contructorexe{
    public static void main(String[] args) {
        demo2 hpp=new demo2(10,20);
       
}
}
