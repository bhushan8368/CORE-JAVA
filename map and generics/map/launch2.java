import java.util.*;
public class launch2 {
   public static void main(String[] args) {
    Map map=new HashMap();
    map.put(1, "sakshi");
    map.put(2, "yash");
    map.put(3, "bhushan");
    System.out.println(map);
    System.out.println(map.get(1));
    Set keyset=map.keySet();
    Iterator itr=keyset.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    Collection values=map.values();
    Iterator itr1=values.iterator();
    while(itr1.hasNext()){
        System.out.println(itr1.next());
    }

    Set entryset=map.entrySet();
    Iterator itr2=entryset.iterator();
    while(itr2.hasNext()){
        Map.Entry data=(Map.Entry)itr2.next();
        System.out.println(data.getKey() +""+data.getValue());

    }



}
}
