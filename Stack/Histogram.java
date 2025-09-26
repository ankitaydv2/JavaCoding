package Stack;
import java.util.*;

public class Histogram {
    
    public static void maxArea(int arr[]){ // O(n)
        int maxArea =0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // Next Smaller Right    // O(n)
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1; i>= 0 ; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();            
            }
            if(s.isEmpty()){
                // -1
                nsr[i] = arr.length;
            } else{
                //top
                nsr[i] = s.peek();
            }
            s.push(i);
        }
// Next Smaller Left    //O(n)
         s = new Stack<>(); // stack ko khali 

        for(int i =0; i< arr.length ; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            } else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // Current Area - width = j -i -1; nsr[i] - nsl[i] -1 ;   // O(n)

        for(int i =0; i<arr.length ; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;

            maxArea = Math.max(currArea, maxArea);

        }
        System.out.print("Max Area in histogram : "+ maxArea);
        
    }
    public static void main(String args[]){
       // int arr[] = {6, 2, 5, 4, 5, 1, 6}; // heights in histogram
        int arr[] = { 2, 4};
        maxArea(arr);
    }
    
}
