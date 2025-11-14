package HashMap;
import java.util.*;

public class CountDistinctElem {
    public static void main(String args[]){
        HashSet<Integer> hs = new HashSet<>();
        int nums[] = {4, 3, 2, 5, 6, 7, 3, 4,2,1};

        for(int i=0; i<nums.length; i++){ // O(n)
            hs.add(nums[i]);
        }
            System.out.println("ans = " + hs.size());
        
    }
    
}
