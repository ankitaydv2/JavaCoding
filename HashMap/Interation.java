package HashMap;
import java.util.*;

public class Interation {

    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("Nepal", 150);
        hm.put("Butan", 200);
        hm.put("US", 300);
        hm.put("Indonesia", 6);
    
        // Interation 
        // we can itertate by entrySet- hm.entrySet()

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys){ // directly loop in key set
            System.out.println("keys="+k+ ", value="+hm.get(k));
        }
    }
}
