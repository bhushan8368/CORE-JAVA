 import java.util.*;
import java.util.function.Consumer;

public class launch3 {
    
    
        public static void main(String[] args) {
            List <Integer> list1=new ArrayList<>(); // Declare and initialize an empty list
            list1.add(10);
            list1.add(20);
            list1.add(30);
            list1.add(40);
            list1.add(50);
    
    
            System.out.println(list1);
    
            List<Integer> list2=Arrays.asList(2,4,6,8);
            System.out.println(list2);
    
            //for(Integer i:list2){
            //    System.out.println(i);
            // }
            //list2.forEach(n-->System.out.println(n));
            /*

            Consumer<Integer> cons =new Consumer<Integer>() 
            {
                @Override
                public void accept(Integer i) {
                    System.out.println(i);
                }

            };
                        list2.forEach(cons);
                        */

            Consumer<Integer> cons=(Integer i)->
            {
                System.out.println(i);
            };
            list2.forEach(cons);

            Consumer<Integer> cons1=i-> System.out.println(i);
            list2.forEach(cons1);
            list2.forEach((i->System.out.println(i)));



    
}
}
