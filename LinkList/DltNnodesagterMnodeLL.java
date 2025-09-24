package LinkList;

public class DltNnodesagterMnodeLL {

     public static class Node{
        int data ;
        Node next;

        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public static Node head ;


    public static Node deleteNafterM(Node head, int m , int n){
        // m iteration k baad n nodes ko delete krna h 
            Node curr = head;

        while( curr != null){
            for(int i = 1 ; i < m && curr != null ; i++){ // m tk chlega phle loop
                   curr = curr.next;
            }
           
            if(curr == null)
            break;
            
            // Delete next n nodes
            Node temp = curr.next;
            for( int j = 0 ; j <n && temp != null ; j++){
                temp = temp.next;
            }
            curr.next = temp ;
            curr = temp;
        }
         return head;
    }
    public static void printList(Node head){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);

        System.out.print("Original List:");
        printList(head);

        int M = 2;
        int N = 2;
        head = deleteNafterM(head, M, N);

        //System.out.println("After deleting: " + N);
        //System.out.println("Nodes after: " + M);
        System.out.println(" after deleting : ");
       printList(head);
    }
}
