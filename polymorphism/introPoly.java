class aeroplane{
    public void takeoff(){
        System.out.println("aeroplane is taking off");

    }
    public void fly(){
        System.out.println("aeroplane is flying");
}
}
class cargoplane1 extends aeroplane{
    public void takeoff(){
        System.out.println("cargo aeroplane requires longer runway");
    }
    public void fly(){
        System.out.println("cargo aeroplane flies at lower height");
    }

}
class passengerplane1 extends aeroplane{
    public void takeoff(){
        System.out.println("passenger aeroplane requires medium size runway");}
    public void fly(){
        System.out.println("passenger aeroplane flies at high height");

    }

}
public class introPoly{
    public static void main(String[] args) {
        cargo c = new cargo();
        passenger p = new passenger();
        //c.takeoff();
       // p.takeoff();
      // aeroplane ref;
      // ref = c;
       //ref.takeoff();
      // ref.fly();
     //  System.out.println("*************************************");
       ref = p;
       ref.takeoff();
       ref.fly();
       


}
}
