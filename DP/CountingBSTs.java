package DP;

public class CountingBSTs {
    public static  int countBST(int n){
        int dp[] = new int[n+1];
        dp[0]= 1;
        dp[1] = 1;

        for(int i= 2 ; i<n+1 ; i++){
            for(int j = 0; j< i ; j++){
                // Ci = Cj * Ci-j-1
                //  dp[i]  += dp[j] *dp[i-j-1];
                int left = dp[j];
                int rgt = dp[i-j-1];
                dp[i] += left * rgt;
            }
        }
        return dp[n];
    }

    public static void main(String args[]){
        int n =4;
        System.out.println(countBST(n));
    }
}
