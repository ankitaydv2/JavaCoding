package GreedyAlgo;
import java.util.*;

public class ChainOfPairs {
    public static void main(String args[]){
        int pairs[][] = {{5, 25},  {39, 60}, {5, 28}, {27,40}, {50, 90}};

        // sort arrays - usong lamba fuctn 
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int chainEnd =pairs[0][1];

        // for loop - paris[i][0] > chainEnd
        for(int i = 0 ; i<pairs.length ; i++){
            if(pairs[i][0] > chainEnd){
                chainLen++ ;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("Max length of chain of pairs : " +chainLen);
    }
    
}
