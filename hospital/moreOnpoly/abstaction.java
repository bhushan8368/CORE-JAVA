abstract class aeroplane1
{
    // abstract variable is not allowed abstarct int age;
    abstract public void takeoff();
    abstract public void fly();
    public void land(){
        System.out.println("Landing");
    }
}
class cargoplane1 extends aeroplane1{
    public void takeoff(){
        System.out.println("CARGO PLANE IS requires longer runway");
    }
    public void fly(){
        System.out.println("CARGO PLANE flies at lower height");
    }
    public void alert(){
        System.out.println("CARGO PLANE is carrying cargo");
    }
}
class passengerplane1 extends aeroplane1{
    public void takeoff(){
        System.out.println("PASSENGER PLANE IS requires shorter runway");
}
    public  void fly(){
        System.out.println("PASSENGER PLANE flies at higher height");
    }
    
}
public class abstraction
{
    public static void main(String[] args) {
        aeroplane1 ref1 = new cargoplane1();
        ref1.takeoff();
        ref1.fly();
        ((cargoplane1) ref1).alert();

        System.out.println("-----------------------------");

        aeroplane1 ref3=new passengerplane1();
            ref3.takeoff();
            ref3.fly();
            ref3.land();


}
}