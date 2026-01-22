package DP;

public class MountainsRanges {
    public static int mount(int n){
         int dp[] = new int[n+1];
         dp[0] =1; 
         dp[1] = 1;

         for(int i =2 ; i<n +1; i++){
            for(int j =0; j<i ; j++){
                int ins = dp[j];
                int out = dp[i-j-1];
                dp[i] += ins * out; // Ci = Cj* Ci-j-1
            }
         }
         return dp[n];
    }

    public static void main(String args[]){
        int n = 5;
        System.out.println(mount(n));
    }
    
}
