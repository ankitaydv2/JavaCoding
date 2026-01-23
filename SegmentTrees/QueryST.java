package SegmentTrees;

public class QueryST {
    static int tree[];

     public static void init(int n ){
        tree = new int[4*n];
    }
    public static int buildST(int arr[], int sti, int strt , int end){
       // Base Case
        if(strt == end){
            tree[sti] = arr[strt]; // last mai single lem bch jata h vhi 
            return arr[strt];
        }
        int mid = (strt + end)/2;
        int left = buildST(arr, 2*sti+1, strt , mid); //left subtree
        int rgt = buildST(arr, 2*sti+2, mid+1, end); // rgt subtree
        tree[sti] = left + rgt;

        return tree[sti];
    }
    // basically getSumUtil is a helper functn
    public static int getSumUtil(int i,int si, int sj ,int qi , int qj){
        if(qj <= si || qi >= sj){ // non overlapping case
            return 0;
        } else if(si >= qi && sj <= qj){ // complete overlap
            return tree[i];     
        } else{ // partial Overlap
            int mid = (si + sj)/ 2;
            int left = getSumUtil(2*i+1, si, mid,qi,qj);
            int right = getSumUtil(2*i+2,mid+1, sj, qi, qj);
            return left + right ;
        }  
    }
    public static int getSum(int arr[], int qi , int qj){
        int n = arr.length;
       return getSumUtil(0, 0, n-1, qi, qj);  
    }

   
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        init(n);

       buildST(arr, 0, 0,n-1);
       System.out.println( getSum(arr, 2, 5));

    }
}
