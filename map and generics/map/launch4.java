import java.util.Hashtable;
import java.util.TreeMap;
import java.util.*;

public class launch4 {
    public static void main(String[] args) {
        Hashtable ht=new Hashtable();
        ht.put("1", "one");
        ht.put("2", "two");
        ht.put("3", "three");
        ht.putIfAbsent("2","two");
        System.out.println(ht);

       TreeMap tm=new TreeMap();
       tm.put("1", "one");
       tm.put("2", "two");
       tm.put("3", "three");
       tm.putIfAbsent("2","two");
       System.out.println(tm);
}
}
