package PriorityQueue;
import java.util.*;

public class FunctnsPQ {
    public static void main(String args[]){
        // 1, 2,  3, 4, 5
        PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(3); // O(log n)
        pq.add(4);
        pq.add(1);
        pq.add(7);
        pq.add(8);

        while(!pq.isEmpty()){
            System.out.print(pq.peek() + " "); // O(1)
            pq.remove(); // O(log n )
        }
    }

    
}
