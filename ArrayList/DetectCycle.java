package ArrayList;
// linked list ....

public class DetectCycle {
    static Node head; // declare head

    // Node class
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isCycle(){
        Node slow = head ;
        Node fast = head ;

        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if( slow == fast){
                return true; // CYCLE DETECT
            }
        }
        return false ; //  NO CYCLE DETECTED

    }

    public static void removeCycle(){
        // Find Cycle
        Node slow = head;
        Node fast = head ;
        boolean cycle = false ;

        while(fast != null && fast.next != null){
          slow = slow.next;
          fast = fast.next.next;
          if(slow == fast){
            cycle = true;
            break;
          }
          if( cycle = false){
            return ;
          }
        }
        // Find MEETing point 
        slow = head ;
        Node prev = null; // last node 
        while( slow != fast){
            slow = head.next;
            prev = fast;
            fast = fast.next;
        }

        // Remove  Cycle
        prev.next = null;

    }
    public static void main( String args[]){
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = temp;
     //  head.next.next.next = head;
        // 1 -> 2 -> 3 -> 1 _> its the corner case and it shows the error 

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
    
}
