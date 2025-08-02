package failsafeFailfast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class launch1 {
    public static void main(String[] args) {
        ArrayList ar1=new ArrayList();
        ar1.add(10);
        ar1.add(20);
        ar1.add(30);
        ar1.add(40);
        ar1.add(50);
        ar1.add(60);
        System.out.println(ar1);
        //failfast
          Iterator itr=ar1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            //ar1.add(100);
        }

        //failsafe
        CopyOnWriteArrayList ar=new CopyOnWriteArrayList();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(40);
        ar.add(50);
        ar.add(60);
        while(itr.hasNext()){
            System.out.println(itr.next());
            ar1.add(100);
        }


        

    
    }

    
    
}
