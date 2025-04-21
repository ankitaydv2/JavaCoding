package Array;
import java.util.Arrays;
import java.util.Collections;

// teeno hi sorting optimize nhi h , teeno ki hi time complexcity O(n^2), teeno hi imp h algorithum phuchi jati h 
public class Sorting {


                //       BUBBLE SORTING     Time comp = O(n^2)
        /* ( Har baar adjacent elements ko compare karo aur
         jo bada hai use aage bhejo. Jaise bubbles
          water mein upar aate hain, waise hi sabse bada
           number har pass mein end tak chala jaata hai )*/ 

/*     public static void bubbleSort(int arr[]) {
        for(int turn = 0; turn < arr.length-1; turn++){
            for(int j =0; j<arr.length-1-turn; j++){
            if(arr[j] > arr[j+1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
             }
          }
       }  
    }
       */ 
     
      //public static void bubbleSort(int arr[]) {
        public static void bubbleSort(Integer arr[]) {
        for(int turn = 0; turn < arr.length-1; turn++){
            int swaps =0; // here we added swaps bcz array is already sorted then we use this 

            for(int j =0; j<arr.length-1-turn; j++){
            if(arr[j] > arr[j+1]){          // idhr hmne turns count kre h 
                //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swaps++ ;
             }
          }
          if(swaps == 0){
            break;
          }
       }  
    }

   // public static void printArr(int arr[]) {
    public static void printArr(Integer arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
       /*  SELECTION SORTING (time comp is also O(n^2))

        (Har pass mein pura array scan karo, sabse chhoti value dhundo, 
        aur usko uski sahi jagah (starting mein) rakh do.) */

    //   public static void SelectionSort(int arr[]) {
        public static void SelectionSort(Integer arr[]) {
        for(int i =0; i<arr.length-1; i++){  // yha pr hmne us min. ko dund k nikala h 
            int minPos = i;
            for(int j =i+1; j<arr.length; j++){
           // if(arr[minPos] > arr[j]){ // increasing order of arrays
           if(arr[minPos] < arr[j]){   // decreasing order of arrays
                  minPos= j;
            }

            }
                // swap
                int temp = arr[minPos];   // us min position ko curr position k sath swap kr diya h
                arr[minPos] = arr[i];
                arr[i] = temp;
        }
       }
                   /*         INSERTION SORTING  Time comp = O(n^2)
                   ( ek-ek element ko uthata hai aur usse uski sahi
                    jagah pe daal deta hai , Just like cards )
                   */ 

      //  public static void insertionSort(int arr[]) {
        public static void insertionSort(Integer arr[]) { // for collection hme int ki jgh Integer likhna pda 
            for(int i =1; i<arr.length; i++){
                int curr=arr[i]; // curr temporary bn jaiga jo elemnt ko hi store kr rha hoga
                int prev = i-1;
                // finding out the cuurent position to insert

             //   while(prev >= 0 && arr[prev] > curr ){ // yh dega ascending order mai sorting 
                    while(prev >= 0 && arr[prev] < curr ){ // descending order
                    arr[prev+1] = arr[prev]; // bde element push hoke piche chle jainge 
                    prev--;
                }
                // insertion 
                arr[prev + 1] = curr ;
            }
            
        }     
       public static void main(String[] args) {
       // int arr[] = {5,4,1,3,2};
       Integer arr[] = {5,4,1,3,2}; // only for collection wale k liye bcz int mai hm reverse nhi le skte h 
       // bubbleSort(arr);
   //  SelectionSort(arr);
   //  insertionSort(arr);
                               /* INBUILT SORTING */
 // Arrays.sort(arr, 0,3); // hme koi b sorting nhi lgai or yh sort ho gye (Time comp = (n log n ))
// Arrays.sort(arr, Collections.reverseOrder()); // reverseorder hmesha objectsb pr kam krta h 
 /* jo int tha vo primitive type ka tha . In JAVA do type k variable hote h 
 (1) Object type k (2) Primitive type - Basic DataType
  So jo reverseCollection h vo basic pr kaam nhi krta . Ab Arr[] h vo ab object h ek Integr class ka 
    */
    Arrays.sort(arr,0,3, Collections.reverseOrder()); 
  printArr(arr);

    } 
}