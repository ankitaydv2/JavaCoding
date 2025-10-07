package GreedyAlgo;
import java.util.*;

public class IndianCoins {
     public static void main(String args[]){
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};

        // sorting is done in greedy approach 
        Arrays.sort(coins , Comparator.reverseOrder());
        int CountofCoins = 0;
        int amount = 8094;
        ArrayList<Integer> ans = new ArrayList<>();

        // loop
        for(int i =0; i < coins.length ; i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    CountofCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println("Total min coins : " + CountofCoins);

        // paus of coins 
        for(int i =0; i<ans.size(); i++){
            System.out.println(ans.get(i) + " ");
        }
        System.out.println();
     }
    
}
