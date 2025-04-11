import java.util.*;


public class day4 {
    public static void main (String args[]){
       /* QUE 1
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num :");
        int num = sc.nextInt();
        if(num>=0){
            System.out.println("num is positive");
        }
        else{
            System.out.println("num is negative");
        
        }
 */
 /* QUE 2
Scanner sc = new Scanner(System.in);
System.out.print("enter the temp :");
double temp = sc.nextDouble();

if(temp>100){
    System.out.println("You have a fever");
}
else{
    System.out.println("You don't have a fever.");
}    
    */

    /*  QUE 3  
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the week num : ");
    int day= sc.nextInt();
    switch(day){
        case 1 : System.out.println("Sunday");
        break;
        case 2 : System.out.println("Monday");
        break;
        case 3 : System.out.println("sunday");
        break;
        case 4 : System.out.println("Tueday");
        break;
        case 5 : System.out.println("Wednesday");
        break;
        case 6 : System.out.println("Thurday");
        break;
        case 7 : System.out.println("Friday");
        break;
        default : System.out.println("Having error");
 }
*/
/* QUES 4 
    int a = 63, b = 36;
   String x =((a < b ) ? "true" : "false");
    String y= ((a > b ) ? "a" : "b" );
    System.out.println(x);
    System.out.println(y);
 */
    /* QUES 5 
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the year : ");
    int a = sc.nextInt();
    if(a%4==0){
        System.out.println("Year is a leep year");
    }
    else{
        System.out.println("Year is not a leep year");
    }
*/
   Scanner sc = new Scanner(System.in);
    System.out.print("Enter the year : ");
    int year = sc.nextInt();

    boolean x = (year % 4) == 0;
    boolean y = (year %100) !=0;
boolean z = ((year % 100==0) && (year %400 == 0));

if (x & (y||z)){
    System.out.println(year+ " is a leap year");
}
else {
    System.out.println(year+ " is not aleap year");
}
  }
    }
    

