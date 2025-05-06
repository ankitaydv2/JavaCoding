package Stringss;

public class subString {
    public static String subStrings(String str , int si, int ei) {
        String substr = " ";
        for(int i =0; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "helloworld";
        System.out.println(str.substring(0,5)); 
        //System.out.println(subStrings(str, 0, 4));
    }
    
}
