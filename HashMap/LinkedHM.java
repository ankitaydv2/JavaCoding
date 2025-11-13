package HashMap;
import java.util.*;

public class LinkedHM {
    public static void main(String args[]){
        // LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        // lhm.put("India", 100);
        // lhm.put("China", 150);
        // lhm.put("US", 200);
        // lhm.put("Asia", 5);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 200);
        hm.put("Asia", 5);

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 200);
        tm.put("Asia", 5); // based on alphabetical order - sorted

       // System.out.println(lhm); 
        System.out.println(hm);
        System.out.println(tm);
    }
    
}
