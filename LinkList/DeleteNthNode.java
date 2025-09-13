package LinkList;

public class DeleteNthNode {
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

   // delete node 

   public void deleteNthfromEnd(int n){
   // calculate size
   int sz =0;
   Node temp = head;
   while(temp!= null){
    temp = temp.next;
    sz++ ;
   } 
   
   if(n == sz){
    head = head.next; // removeFirst
    return;
   }

     // sz-n
     int i =1;
     int iToFind = sz-n;
     Node prev = head;
     while(i < iToFind){
        prev = prev.next;
        i++ ;
     }
    prev.next = prev.next.next;
    return;
}

    public static void main(String args[]){
         DeleteNthNode ll = new DeleteNthNode(); 
       
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);

        ll.print();
        ll.deleteNthfromEnd(3);
        ll.print();
    }
}    

