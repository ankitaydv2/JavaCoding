

public class functions {
   /* public static void printHello(){
      System.out.println("hello"); 
      return; 
    }
    public static void main(String args[]){
        printHello(); //function calll
    }   
         *//* 

         public static int calculateSum(int num1  ,int num2){// parameters or formal parameters
            int sum = num1 + num2;
           return sum;
               }  */
       /* public static void main(String args[]){
Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
           int sum =calculateSum(a, b);// arguments or actual parameters 
            System.out.println("sum is :" +sum); 
            //calculateSum(a, b);
            */

            /* // SWAP - VALUE EXACHANGE 

            public static void swap(int a , int b ){
                // swap
                int temp = a;
                a=b;
                b=temp;
                System.out.println("a : " +a);
            System.out.println("b : " +b);
            }
            public static void main(String[] args) {
                int a =5;
                int b =8;
                swap(a,b);
            }
             //swap
            int temp = a;
            a=b;
            b=temp;
            System.out.println("a : " +a);
            System.out.println("b : " +b);
            */

            /* PRODUCT OF A & B WHERE  a = 3, b =8  
            public static int multiply(int a , int b){
                int product = a*b;
                return product;
            }
            public static void main(String args[]){
                int a = 3;
                int b =8;
            int product = multiply(a,b);
            System.out.println("a * b = " +product);
             product = multiply(34,8);
             System.out.println("a * b = " +product);
            }
*/
/*FACTORIAL OF  A NUM  : N ! = n(n-1)(n-2)(n-3).......1 =n!
   
  public static int factorial(int n){
    int f =1;
    for(int i =1 ; i<=n; i++){
        f=f * i;
    }
    return f ; // factorial of n 
 }
    
//  public static void main(String args[]){
//     System.out.println(factorial(4));
//  }
  

    /* //BINOMIAL COEFFICIENT n=10; r=2 :: nCr= n!/r!(n-r)!
    public static int biCoeff(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int biCoeff = fact_n/(fact_r * fact_nmr);
        return biCoeff;
    }
    public static void main(String args[]){
        System.out.println(biCoeff(5,2));
    }
        */
       /*  // FUNCTION TO CAL SUM OF 2 NUM using Function overloading using PARARMETERS
        public static int sum(int a , int b){
            return a+b;
        }
        // fuctn to cal 3 num
        public static int sum(int a , int b, int c){
            return a+b+c;
                }
                public static void main(String args[]){
                    System.out.println(sum(3,5));
                    System.out.println(sum(3,7,80));

                }
                    */
                 /*  // FUNCTION OVERLOADING USING USING DATATYPES
                    public static int sum(int a , int b, int c){
                        return a+b+c;
                    }
                    public static float sum(float a, float b , float c){
                        return a+b+c;
                    }
                    public static void main(String args[]){
                    System.out.println(sum(3,7,43));
                    System.out.println(sum(3.5f,7.6f, 82.3f));
                    }
*/  
/* PRIME OR NOT 
// only for  n >=2
public static boolean isPrime(int n){
    // corner cases
    //2
    if(n==2){
        return true;
    }

    boolean isPrime = true;
    for(int i =2; i<n; i++){//completely divide
        if(n% i == 0){
           // isPrime = false;
           // break;
           //return isPrime;
           return false;
        }
    }
   // return isPrime; 
   return true;
}
public static void main(String args[]){
   System.out.println( isPrime(2));
}
   */
/* OPTIMISED CDOE 
   public static boolean isPrime(int n ){
    if(n==2){
        return true;
    }
    for(int i=2; i<=Math.sqrt(n); i++){
        if(n% i ==0){
            return false;
        }
    }
    return true;
   }
   public static void main(String args[]){
    System.out.println(isPrime(21));
   }
    */
 /*   
//public static void primesInRange(int n)
public static boolean isPrime(int n ){
    if(n==2){
        return true;
    }
    for(int i=2; i<=Math.sqrt(n); i++){
        if(n% i ==0){
            return false;
        }
    }
    return true;
   }
   public static void primesInRange(int n){
    for(int i = 2; i<=n; i++){
        if(isPrime(i)){ // true
            System.out.print(i+" ");
        }
    }
    System.out.println();
}
public static void main(String args[]){
    primesInRange(22); //2 to 20
}
    */ 
    /* 
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow=0;
        int decNum=0;

        while(binNum >0){
            int lastDigit = binNum % 10;
        decNum = decNum + (lastDigit *(int)Math.pow(2, pow)); 

    pow ++;
     binNum = binNum/10;
      }
      System.out.println("decimal of " +myNum +" = "+ decNum);}
      public static void main(String args[]){
      binToDec(1011);

      } 
      */
     /*  public static void decToBin(int n){
        int pow = 0;
        int binNum = 0;
    int myNum = n;
while(n>0)   {
    int rem = n% 2;
    binNum = binNum + (rem*(int)Math.pow(10, pow));
    pow ++;
    n= n/2;
}  
System.out.println("binary to decimal "+ myNum + " = " + binNum);

}
public static void main(String args[]){
    decToBin(34);
}
    */
    // SCOPES - METHOD SCOPE
   /*  public static void printS(){
        System.out.println(s); // no bcz yh prints ka part h naki main ka part so it can't write value of s
    }
    public static void main(String args[]){
       
        int  s =9;
        System.out.println(s);
    }
        */
       /*  //BLOCK SCOPE  
        // class scope - acces modifiers : public , private , protected 
        public static void main(String args[]){
            int s = 25;
            System.out.println(s);
        }
        //System.out.println(s);
        */
}
       

        
            


