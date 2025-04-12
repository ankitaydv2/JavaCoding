package Array;


public class reverse{ 
 /*   public static void reverse2(int numbers[]) {
        int first = 0, last = numbers.length-1;

        while(first < last){
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp ;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 20};

        reverse2(numbers);
   
        //print
        for(int i=0; i<numbers.length; i++){
           System.out.print(numbers[i]+ " ");
        }
        System.out.println();
    }
        */ 

        // PAIRS in an array 
      /* public static void printPairs(int numbers[]) {
        for(int i =0; i<numbers.length; i++){
            int curr = numbers[i]; // 2 , 4, 6, 8, 10
            for(int j = i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ")" + " ");

            }
            System.out.println();
        }
        
      }  
    public static void main(String[] args) {
        int nnumbers[] = { 2, 4 ,6 ,8, 10};
        printPairs(nnumbers);
    }
        */

        // SUBARRAYS 
        /* 
        
        public static void printSubarrays(int numbers[] ) {
            int ts = 0;// total sum of subarrays 
            //int sum ;
            for(int i = 0; i<numbers.length; i++){ // outer  loop 
                int start = i;
                for(int j = i; j <numbers.length; j++ ){ // inner loop
                    int sum = 0; // sum  initailize at 0
                    int end = j; // j ko end maan liya 
                    for(int k = start ; k<= end; k++){ //print
                     System.out.print(numbers[k]+" "); //subarrays
                   
                    sum = sum + numbers[k] ; // sum ko add krte gye numbers[k] tk 
                     }
                     ts ++;    // total sum ko increse kr diya                
                     System.out.println("sum of arrays : "+ sum); // print sum ko 
                 
                     
                     System.out.println(); // space k liye line 
                }
                System.out.println(); // next line 
            }

            System.out.println("total arrays " +ts); // total arrays ko print kr diya 
            
        }
        public static void main(String[] args) {
            int numbers[]= { 2, 4 , 6, 8, 20}; // array mai numbers h 
            printSubarrays(numbers);
        }
             */

}
