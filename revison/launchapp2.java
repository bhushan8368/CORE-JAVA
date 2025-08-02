import java.util.*;
abstract class shape{
    float area;

    abstract public void input();
    abstract public void compute();
    public void disp(){
        System.out.println(area);
    }

}
class rectangle1 extends shape{
    float length;
    float breath;
    

    public void input(){
        System.out.println("calculation of area of rectangle");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        length=scan.nextFloat();
        System.out.println("Enter the breath of the rectangle:");
        breath=scan.nextFloat();   
    }
    public void compute(){
        area=length*breath;
       
    }
    

}
class square1 extends shape{
    float length;
    

    public void input(){
        System.out.println("calculation of area of square");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of the square:");
        length=scan.nextFloat();
       
    }
    public void compute(){
        area=length*length;
       
    }
    
}
class circle1 extends shape{
    float radius;
    

    public void input(){
        System.out.println("calculation of area of circle");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        radius=scan.nextFloat();
       
    }
    public void compute(){
        area=3.14f *radius*radius;
       
    }

}
class geometry{
    public void poly(shape ref ){
        ref.input();
        ref.compute();
        ref.disp();
    }

}
public class launchapp2{
    public static void main(String[] args){
        rectangle1 rec=new rectangle1();
        square1 sq=new square1();
        circle1 cir=new circle1();
        geometry geo=new geometry();
        geo.poly(rec);
        geo.poly(sq);
        
       
    
        
    }
}