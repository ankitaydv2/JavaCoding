import java.util.*;
public class patternLoop {
    public static void main(String args[]){
      /*   for(int i =1;  i<=4; i++){
            for(int j= i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println(" ");
        }*/ // half pyramid 
        /*for(int i =1 ; i <=5; i++){
            for(int j =1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        } */
       /* a bc def  */
       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
       for(char i = 1 ; i<=n; i++){
        for(char j = 1; j <=i; j++){
            System.out.print(ch);
             ch++ ;
        }
        System.out.println();
       }  */ 

    //  LOOP QUES 
     /*   for(int i =0 ; i<5; i++){
        System.out.println("helllo");
        i+=2;
       } */
        Scanner sc = new Scanner(System.in);
         System.out.print("enter the num : ");
        int num = sc.nextInt();
          if(num % 2 == 0){
    System.out.println("Even no are : "+ num);
  } else{
    System.out.print("Odd no are: "+ num);
  }
  for(int i = 1 ; i <=num ; i++){
    System.out.println(i + "  ");
  }

    } 
}


