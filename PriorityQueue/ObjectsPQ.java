package PriorityQueue;
import java.util.PriorityQueue;

public class ObjectsPQ {
    // in- built hota h comparable in objects 
    static class Student implements Comparable<Student>{ // classes k andr Priority define krni ho tab 
        /*parent class k ander koi funnction hota h usko child 
        class b implemnet krti h to usko bolta h - Overriding  */ 
        String name ;
        int rank ;

        public Student(String name , int rank){
           this.name = name;
           this.rank = rank;
        }

        @Override 
        public int compareTo(Student s2){
            return this.rank - s2.rank;
            /* this ek object h or s2 b ek obj h 12 -15 = -3
               -ve val obj(s1) is less than s2 
               +ve val obj(this) is greater than s2
               0 return then it means both are equal 
             */
        }
    }    
    public static void main(String args[]){
        PriorityQueue<Student> pq = new PriorityQueue<>();
        
        pq.add(new Student (" A", 4));  // O(log n )
        pq.add(new Student (" B", 5));
        pq.add(new Student(" C", 32));
        pq.add(new Student (" D", 2));

        while(!pq.isEmpty()){
            System.out.println(pq.peek(). name+ " -> " + pq.peek().rank); //)(1)
            pq.remove(); // 0(log n )
        }

    }
    
}
