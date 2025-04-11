
import java.util.*;
//import java.math.BigInteger;

public class day5 {
    public static void main(String args[]){
       /*  QUESTION ONE 
        for(int i=0; i<5; i++) {
            System.out.println("Hello");
            i+=2;
            }
            */
  /*   // QUES 2 
            Scanner sc = new Scanner(System.in);
            System.out.print("enter the num : ");
        
              int n = sc.nextInt();
              for(int i=1; i<=n; i++){
                System.out.print( i +" ");
              }
              boolean isEven= true ;
              for(int i=1; i<=n; i++)
              {
                if (i/2==0){
                int sum=0;
              //  sum = sum + (i/2==0);
            
                System.out.print(" num are even");
                isEven = false;}
                else {
                    System.out.print(" num are odd"); 
                }
              
            }
        }
            */
             
            /* // QUES 5 
            for(int i = 0; i <= 5; i++ ) {
                System.out.println("i = " + i );
        
                System.out.println("i after the loop = " + i );    
        }
                 */
    
/*   // QUES 4 

 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the num :");
 int n = sc.nextInt();
 for(int i=1; i<=10; i++){
    System.out.println(n + " * " + i +  " = " + n*i);
 }
    */
    // QUES 3 
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number : ");
    int n= sc.nextInt();
    for(int i = n ; i<=1; i--){
      //n = Math.factorial(int);
        System.out.println("factorial of num :" + i*i );
    }

}
}


