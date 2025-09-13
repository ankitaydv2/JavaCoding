package LinkList;

public class Palindrome {

    public static class Node{
        int data ;
        Node next;

        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public static Node head ;
    public static Node tail ;
    public static int size;

    // addFirst
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // addLast
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // add at index
    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // print list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

   // find mid ( SLOW - FAST APPROACH)

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!= null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //  slow is my midNode
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        // step1 - find mid
        Node midNode = findMid(head);

        // step2  - reverse 2nd half  
         Node prev = null;
         Node curr = midNode.next;
         midNode.next = null;
         Node next;
         while(curr != null){
            next = curr.next;
            curr.next= prev;
            prev = curr;
            curr = next;
         }
         Node right = prev ;// right half head
         Node left = head;

         // step - Check left half & right half
         while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
         }
            return true;
    }
        public static void main(String args[]){
        Palindrome ll  = new Palindrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        //ll.add(2, 3);

        ll.print();
        System.out.println(ll.checkPalindrome());
        ll.print();
    }
}    

