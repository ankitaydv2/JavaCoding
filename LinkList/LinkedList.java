package LinkList;

public class LinkedList {
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

    // MTHODS - add , remove , search 
    public void addFirst(int data){
        // step1 = craete new node 
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step2 = newNode next = head
        newNode.next = head;//link
        
        //step3 - head=newNode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
         size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){ // O(n)
        Node temp = head;
        // if(head == null){
        //     System.out.println("LL is empty");
        //     return;
        // }
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        //linking
         newNode.next = temp.next; 
            temp.next = newNode;
            //update tail if added at the end
            if(newNode.next == null){
                tail = newNode;
            }
    }

    public int removeFirst(){
        if(size ==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size ==1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size ==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if ( size ==1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
      // prev : i = size-2
      Node prev = head;
      for(int i =0; i<size-2; i++){
        prev = prev.next;
      }

      int val = prev.next.data; // tail.data
      prev.next = null;
      tail = prev;
      size--;
      return val;
    }

    public int itrSearch(int key){
        Node temp = head;
        int i =0;

        while(temp != null){
           if(temp.data == key){
            return i;
           }
           temp = temp.next;
           i++;
    }
    // key not found
    return -1;
}

// REcursive Interation
public int helper(Node head, int key){
if(head == null){
    return -1;
 }
 if(head.data  == key){
    return 0;
 }
 int idx = helper(head.next, key);
    if(idx == -1 ){
        return -1;
    }
    return idx+1;
 }

public int recSearch(int key){
    return helper(head, key);
}

    public static void main(String args[]){
        LinkedList ll = new LinkedList(); 
       
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);

   /*     ll.print(); // 1->2->3->4->5
        System.out.println(ll.size);

        ll.removeFirst();
         ll.print(); 
         System.out.println(ll.size);

         ll.removeLast();
         ll.print();
         System.out.print(ll.size);  

        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));*/

        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));

     }
}
