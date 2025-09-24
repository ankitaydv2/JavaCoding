package LinkList;

public class Intersection {

    public static class Node{
        int data ;
        Node next;

        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public static Node headA ;
    public static Node headB ;
    
// intersectin of Two Linked List
public static Node getIntersectionNode(){
      if(headA == null || headB == null){
        return null;
      }
       Node A = headA;
       Node B = headB;

       while( A != B){
        if( A == null){
            A = headB;
        }else{
            A = A.next;
        }
        if( B == null){
            B = headA;
        }
        else{
            B =  B.next;
        }
       }
       return A ;
}
public static void main(String args[]){
    headA = new Node(1);
    headA.next = new Node(2);
    headA.next.next = new Node(3);
    headA.next.next.next = new Node(6);
    //headA.next.next.next.next =intersect;
    Node intersect = new Node(8);
    headA.next.next.next.next = intersect;
    intersect.next = new Node(10);

    headB = new Node(4);
    headB.next =new Node(5);
    headB.next.next = intersect;

    Node ans = getIntersectionNode();
    if(ans != null){
        System.out.println(ans.data);

    } else{
        System.out.println("No intersection");
    }
}
}
