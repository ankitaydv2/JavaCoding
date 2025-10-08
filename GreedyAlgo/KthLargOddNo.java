package GreedyAlgo;

public class KthLargOddNo { // k is the position of the largest Odd no 
    public static void main(String args[]){
    int L = -3;
    int R = 3;
    int k =1;
    int largestOddno =0;
    // (n% 2 != 0)
    if( R % 2 != 0){
        largestOddno = R;
    } else{
        largestOddno =R-1;
    }
    // sort - descending order
    int kthLargestOdd = largestOddno - 2*(k-1);
    if(kthLargestOdd >= L){
        System.out.println(kthLargestOdd);
    } else{
        System.out.println(0);
    }      
}   
}
