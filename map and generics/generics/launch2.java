package generics;
class Gen<T>{
    T obj;

    public Gen(T obj){
        this.obj = obj;
    }
    void disp(){
        System.out.println("the type of data is:"+ obj.getClass().getName());
    }
    public T getObj(){
        return obj;
    }

}


public class launch2 {
    public static void main(String[] args) {
        Gen<Integer> g=new Gen<Integer>(10);
        //Arraylist <Gen> list1=new ArrayList<Gen>();
        //List<String> list2=new Arraylist<String>
        //Collection<Integer> list3=new Arraylist<Integer>();
        //List <Object> list4=new Arraylist<String>();
        //List<Integer> list5=new Arraylist<integer>();\
        
    
    
}
}
