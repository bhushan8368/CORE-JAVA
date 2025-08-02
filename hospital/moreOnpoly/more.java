abstract class aeroplane1
{
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
}
class passengerplane1 extends aeroplane1{
    public void takeoff(){
        System.out.println("PASSENGER PLANE IS requires shorter runway");
}
    public  void fly(){
        System.out.println("PASSENGER PLANE flies at higher height");
    }
    
}
class airport{
    public void poly(aeroplane1 ref){
        ref.takeoff();
        ref.fly();
        System.out.println("--------------------");
    }
}
public class more
{
    public static void main(String[] args) {
        //aeroplane1 ref1 = new cargoplane1();
       // ref1.takeoff();
       // ref1.fly();

       // System.out.println("-----------------------------");

       // aeroplane1 ref3=new passengerplane1();
           // ref3.takeoff();
           // ref3.fly();
           // ref3.land();

        cargoplane1 c=new cargoplane1();
        passengerplane1 p=new aeroplane1();
        airport a=new airport();
        a.takeoff();
        a.fly();


}
}