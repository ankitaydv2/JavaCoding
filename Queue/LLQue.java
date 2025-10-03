package Queue; 
import java.util.*;
 /* 

public class LLQue { // O(1) - optimised 
    static class Node{
        int data; 
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue {
        static Node head = null ;
        static Node tail =null;

        public static boolean isEmpty(){
            return head == null & tail == null;
        } 

        // add
        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode ;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        // remove 
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            int front = head.data;
            // single elemnt 
            if(tail == head){
                tail = head = null;
            } else{
                head = head.next;
            }
            return front;
        }
        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    } 
    */

    public class LLQue {
    public static void main(String args[]){
      //  Queue q = new Queue();
      Queue<Integer> q = new LinkedList<>(); // ArrayDeque 
     //Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
