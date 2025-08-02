import java.util.Scanner;

class rectangle{
    float length;
    float breath;
    float area;

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
    public void disp(){
        System.out.println(area);
    }

}
class square{
    float length;
    float area;

    public void input(){
        System.out.println("calculation of area of square");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of the square:");
        length=scan.nextFloat();
       
    }
    public void compute(){
        area=length*length;
       
    }
    public void disp(){
        System.out.println(area);

}
}
class circle{
    float radius;
    float area;

    public void input(){
        System.out.println("calculation of area of circle");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        radius=scan.nextFloat();
       
    }
    public void compute(){
        area=3.14f *radius*radius;
       
    }
    public void disp(){
        System.out.println(area);

}
}
public class launchapp{
    public static void main(String[] args){
        rectangle rec=new rectangle();
        rec.input();
        rec.compute();
        rec.disp();
         
        square sq=new square();
        sq.input();
        sq.compute();
        sq.disp();
    }
    
}