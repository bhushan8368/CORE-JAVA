//functional interface
@FunctionalInterface
interface Demo{
    void display();
    //void disp();
}

//this is  parent class
@Deprecated
class Plane{
    public void planesfly(){
        System.out.println("Plane is flying");
    }
}

//this is child class
class cargoplanes extends Plane{
    //overriden method from parent class
    @Override
    public void planesfly() {
        System.out.println("Cargo plane is flying");

}
}


public class annonations {
    public static void main(String[] args) {
        Plane c=new cargoplanes();
        c.planesfly();
        

    
}
}
