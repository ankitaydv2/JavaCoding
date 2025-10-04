package Queue;
import java.util.*;

public class Dequer {
    public static void main(String args[]){
        Deque<Integer>deque = new LinkedList<>();
        deque.addFirst(1); //1
        deque.addFirst(2); //  21
        deque.addLast(3);// 213
        deque.addLast(4); // 2134

        System.out.println(deque);
        
        deque.removeLast(); // 213
        System.out.println(deque);

        System.out.println("First el. = " + deque.getFirst()); // 2
         System.out.println("Last el. = " + deque.getLast()); //  3

    }
    
}
