package GreedyAlgo;

public class MaxStrng {
    public static void main(String args[]){
        String str = "LRRRRLLRLLRL";
        int balance = 0; // trackes diff b/w  L nd R
        int count = 0;

        for(int i =0 ; i<str.length() ; i++){
            if(str.charAt(i)=='L' ){
                balance++ ;
            } else if(str.charAt(i)== 'R'){
                balance-- ;
            }
            if(balance == 0){
                count ++ ;
            }
        }
        System.out.println(count);
    }
}
