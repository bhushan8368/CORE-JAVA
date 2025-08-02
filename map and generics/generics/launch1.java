package generics;

import java.util.ArrayList;

public class launch1 {
    public static void main(String[] args) {
        //typesafety
        String ar[]=new String[10];
        ar[0]="java";
        ar[1]="python";
        ar[2]="c++";
        //ar[3]=10;
        String name1=ar[0];
        String name2=ar[1];
        System.out.println(name1);
        System.out.println(name2);

        //no typesafety
        //typesafety achived using generics
        ArrayList<String> al=new ArrayList<String>();
        al.add("java");
        al.add("python");
        al.add("c++");
        //al.add(10);
        //String n1=(String)al.get(0);
        //String n2=(String)al.get(1);
        //String n3=(String)al.get(2);

    String nam1=al.get(0);
    String nam2=al.get(1);




    
}
}
