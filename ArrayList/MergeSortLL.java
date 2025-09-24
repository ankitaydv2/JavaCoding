package ArrayList;
// linked list ....
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


//public class MergeSortLL {

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid node
    }

    private Node merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1); // dummy node 
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
               temp = temp.next;
            } else {
                temp.next= head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
            while(head1 != null){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while(head2 != null){
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
            return  mergedLL.next;
        }

    // fin mid - left right ll - merge
    public Node mergeSort( Node head){
        if(head == null || head.next == null){ // base case
            return head ;
        }
        // find mid 
        Node mid = getMid(head);
        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        
        // merge
        return merge(newLeft, newRight);
    }
}
 public class MergeSortLL{
    public static void main(String args[]){
        //MergeSortLL sorter = new MergeSortLL();
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        // 5 4 3 2 1 

        ll.print();
       // ll.head = sorter.mergeSort(ll.head);
       ll.head = ll.mergeSort(ll.head);
        ll.print();
    }    
}

