class car{
    private engine eng;
    public car(engine eng){
        this.eng=eng;

    }
    public void start(){
        eng.enginestart()
    }
}
class engine{
    public void enginestart()
    {
        System.out.println("car started")
    }
}
class student{
    
    private heart h;
    public student(heart h){
        this.h=h
    }
    public void call(){
        h.heartbeatr()
    }
}
class heart{
    public void heartbeatr(){
        System.out.println("heart is imp")
    }
}
public class hasA{
    public static void main(String[] args){
        heart h=new heart();
        student s=new student(h);
          }
}