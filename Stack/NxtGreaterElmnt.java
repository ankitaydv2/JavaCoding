package Stack;
import java.util.*;

public class NxtGreaterElmnt {
    public static void main(String args[]){
        int arr[] = { 6, 9, 5, 6, 1, 4};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int [arr.length];

        /* (1) QUE -  NEXT GRETER - RIGHT OF X */
        /* (2)  QUE - NEXT Smaller - LEFT OF X  */
        /* (3) QUE - LEFT OF X - NXT GREATR */
        /* (4) QUE - RIGHT OF X - SMALLER  */

        //1 - while loop
        //for(int i = arr.length-1 ; i >= 0 ; i--){  // 1 , 2 
        for(int i =0; i<arr.length; i++){ // 3 ,  4
        //while(!s.isEmpty() && arr[s.peek()] <= arr[i]){ //(1)
        while(!s.isEmpty() && arr[s.peek()] >= arr[i]){ // (2) 
            s.pop();
        }

        // 2 - if-else
        if(s.isEmpty()){
            nxtGreater[i] = -1;
        }
        else{
            nxtGreater[i]= arr[s.peek()];
        }

        // 3- s.push(idx of elemnt)
        s.push(i);
    }
    for(int i = 0 ; i < nxtGreater.length; i ++){
        System.out.print(nxtGreater[i] + " ");
    }
    System.out.println();
}
    
}

