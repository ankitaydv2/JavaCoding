package GreedyAlgo;
import java.util.*;

public class ChocolaPrblm {
    public static void main(String args[]){
        int n =4 , m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4}; // m-1
        Integer costHor[] =  { 4, 1, 2}; // n-1

        // sort kr denge 
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        // initialise
        int v =0 , h=0; // cuts 
        int vp=1, hp =1 ; // pieces intiatlize to 1 
        int cost =0;

        // loop
        while(h < costHor.length && v < costVer.length){
            if(costVer[v] <= costHor[h]){ // horizontal cuts 
            cost += (costHor[h] * vp);
            hp++;
            h++;
            } else{ // vertical cuts 
                cost += (costVer[v] * hp);
                vp++;
                v++;
            } 
        }
        // if any cut left behind
        while(h < costHor.length){
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        while(v < costVer.length){
            cost += (costVer[v] * hp);
                vp++;
                v++;
        }

        System.out.println("Min cost for cuts : "+cost);

    }
    
}
