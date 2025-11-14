package HashMap;
import java.util.*;

public class HashSetOper {
    
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(3);

        System.out.println(set);
        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        
        set.remove(3);
        if(set.contains(3)){
            System.out.println("set contains the value");
        } else{
             System.out.println("set doesn't contains the value");
        }
    }
    
}
