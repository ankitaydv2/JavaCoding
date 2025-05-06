package Stringss;

public class largestString {
    /*  Time comp = length of strings as we comapare one one character , so 
        Time Complex = O(n*x) x is the length of the strings.   */
    public static void main(String[] args) {
        String fruits[] = { "apple", "mango" ,"banana"};

        String largest = fruits[0];
        for(int i =0; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])<0 ){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
    
}
