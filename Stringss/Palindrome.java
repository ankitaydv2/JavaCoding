package Stringss;

public class Palindrome {
    public static boolean ispalindrome(String str) { // linear time complex O(n)
        for(int i = 0; i<str.length()/2; i++){
            int n = str.length();
           if(str.charAt(i) != str.charAt(n-1-i)){
            // not a palindrome 
            return false;
           }
         }
         return true;
    }
    public static void main(String[] args) {
        String str = "racecare";
        System.out.println(ispalindrome(str));
    }
   
    
}
