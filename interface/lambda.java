interface car{
    void drive(int age,int ts);

}
public class lambda {
    public static void main(String[] args){
        car obj= (age,ts) ->System.out.println("....driving"+age +ts);
          //{
               // System.out.println("....driving" +avg);
           // };
        
        obj.drive(16,140);
    }
}