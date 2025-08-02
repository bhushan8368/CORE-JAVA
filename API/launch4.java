import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class launch4 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,4,6,8);
        System.out.println(list);
        Stream<Integer> streamdata=list.stream();

        streamdata.forEach(n->System.out.println(n));


    
}
}
