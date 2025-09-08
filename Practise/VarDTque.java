package Practise;
import java.util.*;

public class VarDTque{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    /*   //que1 average of the 3 numbers
     int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg = (a+b+c)/3.0f;
        System.out.println(avg);  */ 

     /*  //que2  area of the square.
        System.out.print("Side of square is : ");
        int a = sc.nextInt();
        int area = a*a;
        System.out.println("Area of the square is : "+area);  */ 

    /*  // try adding 18% gst tax to the items 
    System.out.print("enter the cost of pencil: ");
     float pencil = sc.nextFloat();
     System.out.print("enter the cost of pen: ");
     float pen = sc.nextFloat();
     System.out.print("enter the cost of eraser: ");
     float eraser = sc.nextFloat();
     float total = (pencil + pen + eraser);
     System.out.print("enter the GST tax: ");
     float Gst = sc.nextFloat();
     float GstTot = (total * Gst)/100;
     System.out.println("Total cost is : "+ total);
     System.out.println("Total cost after GST is : "+ GstTot);  */

     /* que1 // CONDITIONAL STATEMENTS
System.out.print("Income of the user :");
int Income = sc.nextInt();
int tax =0;
int netIncome = 0;

if(Income <500000){
     tax = 0;
    netIncome = Income;
   // System.out.println("Net Income is :"+netIncome);
} else if(Income<1000000){
     tax = (Income*20)/100;
    netIncome = Income - tax;
    // System.out.println("Net Income is :"+netIncome);
}else if(Income >= 1000000){
     tax = (Income*30)/100;
     netIncome = Income - tax;
    // System.out.println("Net Income is :"+netIncome);
}
System.out.println("tax is :"+tax);
System.out.println("Net Income is :"+netIncome); */
/* // que2 
System.out.print("first num :");
int num1 = sc.nextInt();
System.out.print("sec num :");
int num2 = sc.nextInt();
System.out.print("third no. :");
int num3= sc.nextInt();

if(num1 > num2 && num1 > num3){
    System.out.println(num1+" is largest.");
}else if(num2 > num1 && num2 > num3){
     System.out.println(num2+" is largest.");
}else{
     System.out.println(num3+" is largest.");  
}  */
  /*// ternary operator 
 int larger = (5>3)?5:3;
 System.out.println(larger);
String type = (5%2==0)?"even" : "odd" ;
System.out.println(type);  */ 
/*  // Switch case 
int a = 6;
 int b = 4;
 char operator = sc.next().charAt(0);
switch(operator){
    case'+' : System.out.println(a+b);
    break;
    case '-' : System.out.println(a-b);
    break;
    default: System.out.println("not opernationable");
}  */
  /*  //REVERSE OF A NUM
  int num = 256;
  while(num>0){
    int lastdigit = num%10;
    num = num/10;
    System.out.print(lastdigit);
  }*/
int reverse = 0 ;
int n = 10988;
while(n>0){
int lastDigit = n%10;
reverse = (reverse * 10)+ lastDigit ;
n=n/10;
}
System.out.println(reverse);
   } 
}
   