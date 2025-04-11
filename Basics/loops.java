



import java.util.*;

public class loops {
    public static void main(String args[]){
        /* System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");  */
  /*     int num =0;
               while(num<5){
            System.out.println("hello java");
            num++ ;     */ 
    /* int counter = 0;
    while(counter<5){
        System.out.println("hello");
        counter++ ;
    }
    System.out.println("printed hw in 10X");   */

    // print number from 1 to 10
    /*int num=1;
    while(num<=100){
        System.out.print(num+" ");
        num++;
        }
        */

    // print numbers from 1 to n 
    /*Scanner sc = new Scanner(System.in);
    System.out.print("enter the value of n : ");
    int n = sc.nextInt();
    int count =1;
  while(count <=n){
    System.out.print(count+ " ");
    count++ ;
  }
*/
/*  // SUM OF FIRST N NATURAL NUMBERS 
Scanner sc = new Scanner(System.in);
System.out.print("enter the value of n : ");
int n = sc.nextInt();
int sum =0;
int i=1;
while(i<=n){
    sum = sum + i;// sum+=i;
    i++;
}
    System.out.println("sum is : " +sum);
*/

// for LOOP 
/* int i =1;
for (int i =2; i<=10 ; i++ ){
    System.out.println("heyyy");
}
*/
/* // SQUARE PATTERN 
for(int line = 1; line<=4; line++){
    System.out.println("****");
}
    
    int line = 1;
    while(line<=4){
        System.out.println("****");
        line++;
    }
*/
/*// REVERSE THE NUMBER 
int n = 250805;
while(n>0){
    int lastDigit = n%10;
    System.out.print(lastDigit+" ");
    n=n/10;
}
System.out.println();
*/
/* GIVEN N = 10899 
int reverse = 0 ;
int n = 10988;
while(n>0){
int lastDigit = n%10;
reverse = (reverse * 10)+ lastDigit ;
n=n/10;
}
System.out.println(reverse);
*/
/* // DO-WHILE LOOP
int n =1;
do{

    System.out.println("Ankita yadav");
    n++;
}
while(n<=7);
*/
/* 
for(int i = 1; i<=5; i++){
    if(i==3){
        break;}
        System.out.println(i);
        }
    System.out.println("I am out of the loop. ");
    */
    /*// keep enterning numbers till user enters a multiple of 10

    Scanner sc = new Scanner(System.in);
    do { 
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        if(n%10==0){
        break;
    }
        System.out.println(n);
    }
    while (true);
*/
/* // CONTINUE STATEMENT
for(int i = 1; i<=5; i++){
    if(i==3){
        continue;
    }
    System.out.println(i);
}
    */
/*//  Display all numbers entered by user excepy multiples of 10
 Scanner sc = new Scanner(System.in);

 do{
    System.out.print("enter the num :");
    int n = sc.nextInt();

    if(n%10==0){
        continue;
    }
 System.out.println("number is : " +n);
 }
 while(true);

 */

 // CHECK IF A NUM IS PRIME OR NOT 
 Scanner sc = new Scanner(System.in);
 System.out.print("enter the num :"); 
 int n = sc.nextInt();

 if(n==2){
    System.out.println(n+ " is prime");
 }

boolean isPrime = true;
 for(int i=2; /*i<=n-1; */ i<Math.sqrt(n); i++){
    if(n%i==0){
        isPrime = false;   
        // n is a multiple of i(not equal to 1 and i )
        //System.out.println("not prime ");
    }
}
if(isPrime == true){
    System.out.println(n+ " is a Prime ");
}
    else {
        System.out.println(n+ " is not prime ");
    }
}
 }



    
