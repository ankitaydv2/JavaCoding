package GreedyAlgo;
import java.util.*;

public class JobSequencing {
    static class Job{
        int deadline ; 
        int profit ; 
        int id ; // 0(A), 1(B), 2(C)...
    
    public Job(int i , int d, int p){ // constructor 
        id = i ;  
        deadline = d;
        profit = p;
       }   
    }
    public static void main(String args[]){
        int jobsInfo[][] = {{4,20}, {1,30}, {1, 40}, {1,20}};

        // Job jobs[] = new Job[jobsInfo.length];

        ArrayList<Job> jobs = new ArrayList<>(); // jobs ko obj mai convert kr liya 

        for(int i =0; i<jobsInfo.length; i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
        Collections.sort(jobs, (a, b) -> b.profit - a.profit); // descemding order sort

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0; 
        for(int i =0 ; i<jobs.size() ; i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++ ;
            }
        }
        // print seq 
        System.out.println("Max jobs : " + seq.size());
        for(int i = 0 ; i  < seq.size() ; i++){
            System.out.println(seq.get(i) + " ");
        }
        System.out.println();
    }
    
}
