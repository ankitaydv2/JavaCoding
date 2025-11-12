package HashMap;
import java.util.HashMap;
public class Operations {

    public static void main(String args[]){
        // Create 
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert - O(1)
        hm.put("India",  200);
        hm.put("China",  120);
        hm.put("US", 300);

        System.out.println(hm);

      /*   // Get -(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia"));

        // ContainsKey - 0(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Goa"));
     
        // Remove - (1)
        System.out.println(hm.remove("Chin"));
        System.out.println(hm);

        */

        //Size 
        System.out.println(hm.size());

        // Is Empty
        hm.clear(); // map k andr data ko clear kr diya 
        System.out.println(hm.isEmpty());


    }
    
}
