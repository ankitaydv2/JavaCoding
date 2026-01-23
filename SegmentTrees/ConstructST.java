package SegmentTrees;

public class ConstructST {
    static int tree[];

    //initialise
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
    public static void main(String args[]){
        int arr[] = {1, 2,3,4,5,6,7,8};
        int n = arr.length;
        init(n);
        System.out.println(buildST(arr, 0, 0,n-1));

        for(int i =0; i<tree.length ; i++){
            System.out.print (tree[i]+ " ");
        }
    }
}
