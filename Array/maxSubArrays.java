package Array;
import java.util.*;


public class maxSubArrays {
 /*  public static void printMaxSubarraySum( int numbers[] ) {
        int currsum=0;
        int maxsum = Integer.MIN_VALUE;

        for(int i =0; i < numbers.length; i++){
            int start =i;
            for(int j =1; j < numbers.length; j++){
                int end =j ;
                currsum= 0;
                for(int k = start ; k<=end ; k++){//print
                    //subarray sum
                    currsum += numbers[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum = currsum;
                }

            }
        } 
        System.out.println("max sum = " + maxsum);
    }
    public static void main(String[] args) {
        //int numbers[] = {2,4,6,8,10};
        int numbers[] = {1,-2,6,-1,3};
        printMaxSubarraySum(numbers);
    }
}
    */  
/* TIME COMPLEXCITY
  3 loop jab n ho time complecity and then its O(n*n*n)(n cube) which is bad time complexcity
   now we have another technique to optimise this complexcity whicch is  PREFIX ARRAY 
 */
/* 
public static void printMaxSubarraySum( int numbers[] ) {
    int currsum=0;
    int maxsum = Integer.MIN_VALUE;
    int prefix[]= new int[numbers.length];

    prefix[0] = numbers[0];
    // calculate prfix array
    for(int i =1; i<prefix.length; i++){
    prefix[i] = prefix[i-1]+ numbers[i];
    }

    for(int i =0; i < numbers.length; i++){
        int start =i;
        for(int j =i; j < numbers.length; j++){
            int end =j ;

            currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start -1] ;

            if(maxsum< currsum) {
                maxsum = currsum;
            }
        }
    }
    System.out.println("max sum = " + maxsum);
}
public static void main(String[] args) {
    int numbers[] = {1,-2,6,-1,3};
        printMaxSubarraySum(numbers);
    }
    
}
    */ 
    /* KADANES Algoritjhum - O(n) */
    public static void printMaxSubarraySum( int numbers[] ) {
        int currsum=0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[]= new int[numbers.length];
    
        prefix[0] = numbers[0];
        // calculate prfix array
        for(int i =1; i<prefix.length; i++){
        prefix[i] = prefix[i-1]+ numbers[i];
        }
    
        for(int i =0; i < numbers.length; i++){
            int start =i;
            for(int j =i; j < numbers.length; j++){
                int end =j ;
    
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start -1] ;
    
                if(maxsum< currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum = " + maxsum);
    }
    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs =0;

        for(int i =0 ; i<numbers.length ; i++){
            cs = cs + numbers[i];
            
            if(cs <0){
                cs =0;
               
            }
             ms = Math.max(cs , ms);
         }
        System.out.println("our max subarray is : " +ms);
    }
    public static void main(String[] args) {
       x int numbers[] = {-2,-3, 4, -1, -2, 1, 5 ,-3};
       // int numbers[] = {-2,-3, -4, -1, -2, -11,-5 ,-3};
           // printMaxSubarraySum(numbers);
           kadanes(numbers);
        }
        
    }

