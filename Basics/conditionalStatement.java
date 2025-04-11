import java.util.*;

public class conditionalStatement {
    public static void main(String args[]){
       /*  int age = 16;
        if(age>=18){
            System.out.println("adult : drive , vote");
        }
        if(age >13 && age<18){
            System.out.println("teenagers");
        }
            else {
                System.out.println("not adult");
            }
                */

     /*   // PRINT LARGERST OF 2
        int a = 3;
        int b = 12;

        if (a>=b){
            System.out.println("a is larger ");
        }  
        else 
        {
            System.out.println(" b is larger ");
        }
            */ 

           /*  // PRINNT IF A NUM  IS ODD OR EVEN 
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if(num%2==0){
                System.out.println("num is EVEN");
            }
            else 
            {
                System.out.println("num is ODD");
            }
                */
              /*   // ELSE-IF STATEMENT 
                 int age = 13;
                 if(age>=18){
                    System.out.println("adult");
                 }
                 else if ( age>12){
                    System.out.print("teenage");
                 }
                 else {
                    System.out.println("not adult");
                 }
                    */
   /*                 // TAX CALCULATOR
          Scanner sc = new Scanner(System.in);
          int income = sc.nextInt();
          int tax;

          if (income < 500000){
            tax = 0;
            //System.out.println("tax is 0");
          }
          else if ( income >= 500000 && income <1000000){
           // System.out.println(" tax will be 0.")
           tax = (int)(income * 0.2);
          }
          else {
            tax = (int) (income * 0.3);
          }
      System.out.println(" ypur tax is :" +tax)  ;  
   */ 
    /* 
   // PRINT THE LARGEST OF 3
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     if((a>=b) && (a>=c)){
        System.out.print("a is largerest.");
     }
     else if((b>=a) && (b>=c)){
        System.out.print("b is largerest.");
     }
     else {
        System.out.print("c is largerest.");
     }
        */
/* 
        // TERNARY OPERTAORS
        int num =80941;
        String type = ((num%2==0)?"even":"odd");
        System.out.println(type);


// STUDENT PASS OR FAIL
Scanner sc = new Scanner(System.in);
System.out.print("enter the marks: ");
int marks = sc.nextInt();
String type = (marks>=33 ? " pass ": "fails");
System.out.print(type);
*/

/*    // SWITCH STATEMENT 
//int num = 8;
char ch = 'a';
switch('a'){
    case 'b': System.out.println("samosa");
    break;
    case 'c' : System.out.println("burger");
    break;
    case 'a' : System.out.println("mango shake");
    break;
    default : System.out.println("We wake up ");
}
*/

// CALCULATOR 
Scanner sc = new Scanner(System.in);
System.out.print("Enter the value of a : ");
int a = sc.nextInt();
System.out.print("Enter the value of b : ");
int c = sc.nextInt();
System.out.print("Enter the value of c : ");
int b = sc.nextInt();
System.out.print("Enter the operator : ");
char operator = sc.next().charAt(0);

switch(operator){
    case '+' : System.out.println(a+b+c);
    break;
    case '-' : System.out.println(a-b-c);
    break;
    case '*' : System.out.println(a*b*c);
    break;
    case '/' : System.out.println(a/b);
    break;
    case '%': System.out.println(a%b);
    break;
    default : System.out.println("Calculator not that advance.");

}
    }
    
}
