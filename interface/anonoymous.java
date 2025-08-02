interface car{
    void drive();

}
public class anonoymous {
    public static void main(String[] args){
        car obj=new car(){
            public void drive(){
                System.out.println("....driving");
            }
        };
        obj.drive();
    }
}