package PriorityQueue;
import java.util.*;

public class SlidingWindow { // 0(n log k)
    static class Pair implements Comparable<Pair>{
        int val ;
        int idx ;

        public Pair(int val , int idx){
            this.val = val ;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2){
            //ascending 
            //return this.val-p2.val ;
            //descending order 
            return p2.val -this.val ;
        }
    }

    public static void main(String args[]){
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7};
        int k =3; // window size 
        int res[] = new int[arr.length-k+1]; // n-k+1

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // 1st window 
        for(int i =0 ; i<arr.length ; i++){
            while(pq.size() > 0 && pq.peek().idx <= (i-k)){
                pq.remove();
            } 

            pq.add(new Pair(arr[i], i));
            if(i >= k-1){
            res[i-k+1] = pq.peek().val ;
        }
    }
        //print
        for(int i =0; i<res.length ; i++){
            System.out.print(res[i]+ " ");
        }
        System.out.println();
    }    
}
