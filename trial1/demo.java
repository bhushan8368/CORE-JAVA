public class demo{
    class engine{
        void disp(){
            System.out.println('inner class disp')
        }
    }
    public static void main(String[] args){
        demo car=new demo();
        demo.engine e=car.new engine();
    }
}
public 