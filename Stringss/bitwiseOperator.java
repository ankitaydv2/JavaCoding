
//package Stringss;
public class bitwiseOperator {

    /*
     * public static void oddOrEven(int n ) {
     * int bitmask =1;
     * if((n & bitmask) == 0){
     * System.out.println("even");
     * } else {
     * System.out.println("odd");
     * }
     * }
     */
 /*
     * public static int getIthbit(int n , int i) {
     * int bitmask = 1 <<i;
     * if((n & bitmask )== 0){
     * return 0;
     * } else {
     * return 1;
     * }
     * }
     */
 /*
     * public static int setIthbit(int n , int i){
     * int bitmask = 1<<i;
     * 
     * return n |bitmask;
     * 
     * }
     */
 /*
     * public static int clearIthbit(int n , int i){
     * int bitmask = 1<<i;
     * bitmask = ~bitmask;
     * return n & bitmask;
     * }
     * }
     */
 /*
     * public static int setIthbit(int n , int i){
     * int bitmask = 1<<i;
     * 
     * return n |bitmask;
     * 
     * }
     */
    public static int clearIthbit(int n, int i) {
        int bitmask = 1 << i;
        bitmask = ~bitmask;
        return n & bitmask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit ==0){
        // return clearIthbit(n, i);
        // }else{
        // return setIthbit(n, i);
        // }
        n = clearIthbit(n, i);
        int Bitmask = newBit << i;
        return n | Bitmask;
    }

    public static int ClezIthbitlearIthbit(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    public static void main(String[] args) {
        /*
         * System.out.println((5 & 6));
         * System.out.println((5 | 6));
         * System.out.println((5 ^ 6));
         * System.out.println((5 << 2));
         * System.out.println((5 >> 2));
         * System.out.println((6>>1));
         * System.out.println((~5));
         * System.out.println((~0));
         */
 /*
         * oddOrEven(3);
         * oddOrEven(5);
         * oddOrEven(17);
         * oddOrEven(4);
         */
 /*
         * System.out.println(getIthbit(10, 3));
         * System.out.println(getIthbit(10, 2));
         */
 /*
         * System.out.println((setIthbit(12, 2)));
         * System.out.println((setIthbit(10, 2)));
         */
        // System.out.println((clearIthbit(10, 1)));
        // System.out.println((updateIthBit(10, 2, 1)));tr
        System.out.println(ClezIthbitlearIthbit(15, 2));
    }
}
