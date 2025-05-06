package Stringss;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch ='a'; ch <='z'; ch++){
        sb.append(ch);
        }//abcde....
        // time comp = O(26)
        // if string le lete and append nhi lete to time comp = O(26 * n^2)
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
