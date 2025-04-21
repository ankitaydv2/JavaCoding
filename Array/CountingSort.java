package Array;

public class CountingSort { /*
      count sort basiclly positive numbers k 
    liye hota h jinki range kam hoti h , jin arr ko sort krna h
     vo numbers mai zyada ho skte h but value mai choti hote h 
     IMP :  INBUILT SORT HI LGANI H EXAMS H KHUD SE SORT NHI KRNA H 
    */ 
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
    public static void countingSort(int arr[] ) {
        int largest = Integer.MIN_VALUE;
        for(int i= 0; i<arr.length; i++){
            if(arr[i] > largest){
            largest = arr[i];
        }
        }

       int count[] = new int [largest+1];
        for(int i =0 ; i <arr.length; i++){
            count[arr[i]]++;

        }
        //sorting
        int j =0;
        for(int i =0; i<count.length ; i++){
           while(count[i] > 0){
            arr[j] = i;
            j++;
            count[i]--;
           }
    }
    
}
public static void main(String[] args) {
    int arr[] = { 5,1,5,4,1,3,2};
    countingSort(arr);
    printArr(arr);
}
}