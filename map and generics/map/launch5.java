import java.util.WeakHashMap;

class employee{
    private String name;
    private int empid;
    
    public employee(String name,int empid){
        this.name=name;
        this.empid=empid;

    }
    public String toString(){
        return  empid +" ";
    }
    @Override
    public void finalize(){
        System.out.println("clean up by work by gc before allocation");
    }
}

public class launch5 {
    public static void main(String[] args) {
    
        employee e=new employee("Rahul",101);
        WeakHashMap hm=new WeakHashMap<>();
        hm.put(e, "Rahul");
        System.out.println(hm);
        e=null; // eligible for garbage collector
        System.gc(); // invocking garbage collector
        System.out.println(hm);
        System.out.println("last line");
}
}
