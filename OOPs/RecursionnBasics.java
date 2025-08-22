public class RecursionnBasics {

    // for decreasing order n to 1
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    // for increasing order from n to 1
    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    // calculate factorial
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    // calculate Sum of n numbers
    public static int CalSum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = CalSum(n - 1);
        int Sn = n + Snm1;
        return Sn;
    }

    // calculate nth term in fibonaci
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    // check array is SORTED or not
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // First Occurrence of the array at index
    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }

    // Last Occurrence of the array at index
    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    // print X to power n
    public static int power(int X, int n) {
        if (n == 0) {
            return 1;
        }
        // int Xnm1 = power(X, n-1);
        // int Xn = X * Xnm1;
        // return Xn;
        return X * power(X, n - 1);
    }
    // OPTIMIZED WAY AHEAD ( x to power n)

    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;
        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    // TILING PROBLEMS
    public static int tilingProblem(int n) {// 2 X n ( floor size)
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        /*
         * // kaam
         * // vertical choice
         * int fnm1 = tilingProblem(n-1);
         * 
         * // Horizontal Choice
         * int fnm2 = tilingProblem(n-2);
         * 
         * int totalWays = fnm1 + fnm2;
         * return totalWays;
         */

        return tilingProblem(n - 1) + tilingProblem(n - 2);

    }

    // remove DUPLICATES from an Array
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        // kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicate
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    // FRIENDS PAIR PROBLEM
    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        /*
         * //choice
         * // single
         * int fnm1 = friendsPairing(n-1);
         * //pair
         * int fnm2 = friendsPairing(n-2);
         * int pairWays = (n-1)* fnm2;
         * //totalWays
         * int totWays = fnm1 + pairWays;
         * return totWays;
         */

        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }

    public static void printBinStrings(int n, int lastplace, String str) {
        // Base class
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kaam
        /*
         * if(lastplace == 0){
         * str.append("0");
         * // sit 0 on chair nth
         * printBinStrings(n-1,0, str.append("0"));
         * printBinStrings(n-1, 1, str.append("1"));
         * }else{
         * printBinStrings(n-1,0, str.append("0"));
         * }
         */

        printBinStrings(n - 1, 0, str + "0");

        if (lastplace == 0) {
            printBinStrings(n - 1, 1, str + "1");
        }

    }

    public static void main(String args[]) {

        /*
         * int n =15;
         * printDec(n);
         * printInc(n);
         * System.out.println();
         * System.out.println( fact(n));
         * System.out.println(CalSum(n));
         * System.out.println(fib(n));
         * int arr[] = { 1, 2, 73, 4, 5, 7, 3, 4, 7};
         * System.out.println(isSorted(arr, 0));
         * System.out.println(firstOccurence(arr, 4, 0));
         * System.out.println(lastOccurence(arr, 7, 0));
         * System.out.println(power(2, 10));
         * int a =2;
         * int n = 10;
         * System.out.println(optimizedPower(a ,n));
         * System.out.println(tilingProblem(4));
         * String str = "appnnacollege";
         * removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
         * System.out.println(friendsPairing(3));
         */
        printBinStrings(3, 0, "");
    }
}
