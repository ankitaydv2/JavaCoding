package ArrayList;
import java.util.ArrayList;

public class Classroom {
    public static void main(String args[]){
        // Java Collection FrameWork -> java k andr bhut sare inbuilt interface
        // className ObjectName = new ClassName();
       ArrayList<Integer> list = new ArrayList<>();
       ArrayList<String> list2 = new ArrayList<>();
       ArrayList<Boolean> list3 = new ArrayList<>();

     // System.out.print("a"); 
     list.add(1); // O(1)
     list.add(2);
     list.add(3);
     list.add(4);

     System.out.println(list.size());
   //  list.add(1, 9); // O(n) linear time lgta h baki add mai O(1)
    // System.out.println(list);

// get operation
    //  int element =list.get(2);
    //  System.out.println(element);

    //  // Delete
    //  list.remove(2);
    //  System.out.println(list);

     //set
    //  list.set(2,10);
    //   System.out.println(list);
      
    //   //contain element
    //    System.out.println(list.contains(1));
    //    System.out.println(list.contains(11));

    // print the arrayList
     for(int i =0; i<list.size(); i++){
        System.out.print(list.get(i)+ " ");
     }
     System.out.println();
    }
    
}
