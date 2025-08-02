package generics;

import java.util.ArrayList;
import java.util.Collections;


public class launch3 {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList<>();
        al1.add("java");
        al1.add("hyder");
        al1.add("python");
        al1.add("rohan");
        System.out.println(al1);
        Collections.sort(al1);
        System.out.println(al1);

        ArrayList al2=new ArrayList<>();
        al2.add(10);
        al2.add(20);
        al2.add(30);
        al2.add(40);
        System.out.println(al2);
        int index=Collections.binarySearch(al2, 10);
        System.out.println(al2);
        Collections.rotate(al2, 3);
        System.out.println(al2);
        Collections.shuffle(al2);
        System.out.println(al2);
    }


        
    
}
