package arraydeque;

import java.util.ArrayDeque;

public class launch1 {
    public static void main(String[] args) {
        // Create an array deque
        ArrayDeque ad1=new ArrayDeque();
        // Add elements to the deque
        ad1.add("Apple");
        ad1.add("Banana");
        ad1.add("Cherry");
        System.out.println(ad1);
        ad1.addFirst(10);
        ad1.addLast(20);
        System.out.println(ad1);
        ad1.add("pw");
        System.out.println(ad1);

        ad1.offer(500);
        ad1.offerLast(100);
        ad1.offerFirst(1);
        System.out.println(ad1);
    }
    
}
