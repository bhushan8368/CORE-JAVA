import java.security.KeyStore.Entry;
import java.util.*;


class student{
    private String name;
    private int age;
    private String city;

    public student(String name,int age,String city){
        this.name=name;
        this.age=age;
        this.city=city;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
        
    }
    public String getCity(){
        return city;
    }
    public String toString(){
        return "Name: "+name+"\nAge: "+age+"\nCity: "+city;
    }

}

public class launch3 {
    public static void main(String[] args) {
        student s1=new student("Rahul",25,"Delhi");
        student s2=new student("rohit", 19, "gurgaon");
        student s3=new student("ramesh", 20, "noida");

        Map map=new HashMap();
        map.put(1,s1);
        map.put(2,s2);
        map.put(3,s3);

        System.out.println(map);

        Set set=map.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry data=(java.util.Map.Entry)itr.next();
            System.out.println(data.getKey()+" "+data.getValue());
        }

        
    }

    
}

