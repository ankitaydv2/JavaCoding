package Stack;
import java.util.*;

public class DuplicatePrnths {
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i =0; i < str.length(); i++){
            char ch = str.charAt(i);

        // closing  - then opening  braces
        // closing 
        if(ch == ')'){
            int count = 0 ;
            while(s.peek() != '('){
                s.pop();
                count++;
            }
            if(count <1){
                return true; // duplicate
            } else{
                s.pop(); // Opening pair
            }
        } else{
            // Opening 
            s.push(ch);
        }
    }
     return false;
}
    public static void main(String args[]){
        String str = "((a+b))"; // duplicate
        String str1 = "{([a]+([a+b]-(c-d)))}"; // duplicate
        String str2 = "[a-b]"; // not duplicate

        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }  
}
