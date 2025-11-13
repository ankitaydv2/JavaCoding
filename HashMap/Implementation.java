package HashMap;
import java.util.*;

public class Implementation {
    static class HashMap<K, V>{ // generics
        private class Node{
            K key;
            V value;

            public Node(K key, V value){ // constructor
                this.key = key ;
                this.value = value ;
            }
        }

        private int size; // n = size
        private int N ; // N = bucket.length
        private LinkedList<Node> buckets[]; 

        //@SupperssWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets= new LinkedList[4];
            for(int i =0; i<4 ; i++){
                this.buckets[i] = new LinkedList<>();
           }
        }

        private int hashFunction(K key){
            int hc = key.hashCode();
            // 123 ; -123
           return Math.abs(hc) % N; // N = buckets.length
        }

        private int SearchInLL(K key , int bi){
            LinkedList<Node> ll = buckets[bi];
            int di =0;

            for(int i =0; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di ;
                }
                di++ ;
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N* 2];
            N = 2*N;
            for(int i =0; i<buckets.length ; i++){
                buckets[i] = new LinkedList<>();
            }

            // nodes -> add in bucket
        for(int i =0; i <oldBuck.length ; i++){
            LinkedList<Node> ll = oldBuck[i];
            for(int j =0; j<ll.size(); j++){
                Node node = ll.remove();
                put(node.key, node.value);
            }
        }
    }

        public void put(K key, V value){ // 0(lambda) -> 0(1)
            int bi = hashFunction(key); // 0 to size()-1
            int di = SearchInLL(key, bi); // valid; -1
        
            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                size++ ; // n 
            }

            double lambda = size/N ; // decimal value 
            if(lambda > 2.0){
                rehash();
            }
        }

        public boolean containsKey(K key){
            int bi = hashFunction(key); // 0 to size()-1
            int di = SearchInLL(key, bi); // valid; -1
        
            if(di != -1){ // valid value then true 
                return true;
                
            } else { // false 
                return false ;
            }
        }

        public V remove(K key){ // 0(1)
             int bi = hashFunction(key); // 0 to size()-1
            int di = SearchInLL(key, bi); // valid; -1
        
            if(di != -1){
                Node node = buckets[bi].remove(di);
                size-- ;
                return node.value;
            } else {
                return null ;
            }
        }

        public V get(K key){
             int bi = hashFunction(key); // 0 to size()-1
            int di = SearchInLL(key, bi); // valid; -1
        
            if(di != -1){
                Node node = buckets[bi].get(di);
                 return node.value;
            } else {
                return null ; 
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i =0; i<buckets.length ; i++){
                LinkedList<Node> ll = buckets[i];
                for(Node node : ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return size == 0;
        }

        public static void main(String args[]){
            HashMap<String, Integer> hm = new HashMap<>();
            hm.put("India", 100);
            hm.put("China", 150);
            hm.put("US", 50);
            hm.put("Nepal", 5);
            hm.put("America", 219);

            ArrayList<String> keys = hm.keySet();
            for(String key : keys){
               System.out.println(key);
            }

            System.out.println(hm.get("India"));
            System.out.println(hm.remove("India"));
            System.out.println(hm.get("India"));
        }
    }
    
}
