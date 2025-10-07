package GreedyAlgo;
import java.util.*;

public class MinAbsDiff {
    public static void main(String args[]){
        int A[] = {1, 2, 3, 4, 9, 5};
        int B[] = {3, 2, 1, 6, 3, 8};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for(int i = 0 ; i<A.length; i++){
            minDiff +=  Math.abs(A[i] - B[i]);
        }
        System.out.println("Min Absolute Diff is : " + minDiff);
    }
    
}
