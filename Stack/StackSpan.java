package Stack;
import java.util.*;


public class StackSpan {
    public static void StackSpans(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>(); // solve by stack 
        span[0]= 1; // idx 0 pr always 1 span
        s.push(0);

        for(int i =1 ; i <stocks.length; i++){
            int currPrice = stocks[i]; // aaj ka price 
            while(!s.isEmpty() && currPrice > stocks[s.peek()]){ // compare baki k pice se high h ya nhi
                s.pop(); // chote wale elements nikalenge
            } 
            if(s.isEmpty()){
                span[i] = i+1;
            }
            else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }

    }
    public static void main(String args[]){
        int stocks[] = { 100 , 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];
        StackSpans(stocks, span);

        for(int i =0; i <span.length ; i++){
            System.out.print(span[i] + " ");
        }
    }
    
}
