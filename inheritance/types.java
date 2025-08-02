class aeroplane{
    public void takeoff(){
        System.out.println("aeroplane is taking off");

    }
    public void fly(){
        System.out.println("aeroplane is flying");
}
}
class cargo extends aeroplane{
    public void fly(){
        System.out.println("cargo aeroplane is flying");
    }
    public void carrygoods(){
        System.out.println("cargo aeroplane is carrying goods");
    }

}
class passenger extends aeroplane{
    public void fly(){
        System.out.println("passenger aeroplane is flying");}
    public void carrypassenger(){
        System.out.println("passenger aeroplane is carrying passenger");

    }

}
public class types{
    public static void main(String[] args) {
        cargo c = new cargo();
        passenger p = new passenger();
        c.takeoff();
       p.takeoff();
      
}
}
