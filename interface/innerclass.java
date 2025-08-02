class a{
    public void show(){
        System.out.println("in show")
    }
    class b{
        public void display(){
            System.out.println("in display")
        }
    }
    
}
public class innerclass{
public static void main(String[] args){
    a obj =new a();
    a.b obj1=obj.new b();
    obj.show();
    obj1.display();


}
}