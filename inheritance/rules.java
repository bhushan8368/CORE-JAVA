class animal{
    public void eat(){
        System.out.println("animal eats everyday");
    }
    public void age(int x){
        System.out.println("animal age is");
    }
}
class tiger extends animal{
    public void eat(){
        System.out.println("tiger hunts and eat");
    
}
}
public class rules{
    public static void main(String[] args){
        tiger t=new tiger();
        t.eat();
        // public int age(){
            //     return 5;
         // }
    
        }
    
    public void age(){    //consider as new methods acc to method overloading

    }
}