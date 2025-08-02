
import java.util.*;
public class launch1{
    public static void main(String[] args){
        ArrayList al1=new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);
        System.out.println("*****************************************");
        ArrayList al2=new ArrayList();
        al2.add("pwskills");
        al2.add("java");
        al2.add("python");
        System.out.println(al2);
        System.out.println("********************************");
        al2.add(100);
        System.out.println(al2);
        System.out.println("******************************");
          
        ArrayList al3=new ArrayList();
        al3.add(100);
        al3.add(200);
        al3.add(300);
        System.out.println(al3);
        System.out.println("AFTER BEING ADDED");
        al3.addAll(al2);
        System.out.println(al3);
        al3.add(2,"pw");
        System.out.println(al3);
        
    }
}