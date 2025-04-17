package Array;

import java.util.*;

public class trappedWater {
    public static int trappedRainwater(int height[]) { // O(n)
        // calculate left max boundary
        // height.length = n
        int n = height.length;
/* 
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i =1; i<height.length; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
            */
            int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i =1; i<n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        // calculate right max boundary
        int rightmax[] = new int [n];
        rightmax[n-1] = height[n-1];
        for(int i = n -2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int trapedWater =0;
        //loop
        for(int i=0; i<n; i++){

              // waterlevel = min(leftmax bound , rightmax bound )
            int waterlevel = Math.min(leftmax[i] , rightmax[i]);

             // trapped water = waterLevel - height[i]
             trapedWater += waterlevel - height[i];
        }
      
       return trapedWater;
        
    }
    public static void main(String[] args) {
        int height[] = { 4 , 2, 0 , 6, 3, 2 , 5};
        System.out.println(trappedRainwater(height));
        

    }
    
}
