package HashMap;
import java.util.* ;

public class IterationHashSet {

    public static void main(String args[]){
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Jaipur");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Benguluru");
        System.out.println(cities);

        // Iterator it = cities.iterator();
        // while(it.hasNext()) {
        //     System.out.println(it.next());
        // }

        /* by ADVANCE LOOP

        for(String city : cities){ 
            System.out.println(city);
        } 
            */
        

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Jaipur");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Benguluru");
        System.out.println(lhs);

        // lhs.remove("Jaipur");
        // System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Jaipur");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Benguluru");
        System.out.println(ts);
        
        ts.remove("Jaipur");
        Iterator it = ts.iterator();
        while(it.hasNext()) {
            System.out.print(it.next()+ " ");
        }

    }
    
}
