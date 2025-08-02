package constructor;

class demo {
    private int a;
    private int b;

    public demo(int a,int b){
        this.a=a;
        this.b=b;
    }
    public  demo(){
        System.out.println("zero parameterized constructor by programmer");
    }

    void disp() 
    {
        System.out.println(a);
        System.out.println(b);
    }
}

public class launch2 {
    public static void main(String[] args) {
        demo d = new demo(10,10);
        d.disp();
        demo d2=new demo();
        d2.disp();
    }
}
