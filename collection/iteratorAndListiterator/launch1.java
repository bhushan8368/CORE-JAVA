package iteratorAndListiterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class launch1 {
    public static void main(String[] args) {
        ArrayList ar1=new ArrayList();
        ar1.add(10);
        ar1.add(20);
        ar1.add(30);
        ar1.add(40);
        ar1.add(50);
        System.out.println(ar1);

        //for loop
        for(int i=0;i<ar1.size();i++){
            //Object o=al.get(i);
            //System.out.println(o);
            System.out.println(ar1.get(i));
        }
        // for each
        for(Object o:ar1){
            System.out.println(o);
        }
        Iterator itr=ar1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        ListIterator litr=ar1.listIterator();
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
            
        }

        
    
        
    
}
}
