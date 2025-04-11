public class pattern2 {
  /*   public static void hollow_rectangle(int totRows, int totCol){
     //outer loop
        for(int i = 1; i<=totRows; i++){
            //inner columns
            for(int  j = 1; j<=totCol ; j++ ){
                //cells -(i,j)
                if(i== 1 || i == totRows || j == 1 || j==totCol){
                    //boundary cells 
                   System.out.print("*"); 
                }
            
                else{
                    System.out.print(" ");                
            }
        }
        System.out.println();
    }
}
        public static void main(String args[]) {
            hollow_rectangle(4,5);
       */ 
      /*  INVERTED HALF PYRAMID 
      public static void main(String args[]){
      int n = 5;
      // outer loop 
      for(int i =1; i<=n; i++){
        //spaces
        for(int j = 1; j<=n-i; j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
      }
    }
  */    
/*  public static void inverted_halfPyramid(int n){
    for(int i=1;i<=n;i++){
        for(int j=1; j<=n-i+1; j++){
        System.out.print(j+" ");
    }
        System.out.println();
  }
}
  
  public static void main(String args[]){
    //hollow rectangle 
    inverted_halfPyramid(4);
 }      
*/ 
/* 
public static void floyds_triangle(int n){
    int counter = 1;
    for(int i =1; i <=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
    }
}
public static void main(String args[]){
    floyds_triangle(5);
}
    */
    /* 
    public static void zero_one_tri(int n ){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 ==0){//even
                    System.out.print("1");}
                    else{
                        System.out.print("0");
                    }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        zero_one_tri(5);
    }
        */
    /*     // BUTTERFLY PATTERN 
       public static void butterfly_pattrn(int n){
        // 1st half
for(int i = 1; i<=n ; i++){
    // stars 
    for(int j=1; j<=i; j++){
        System.out.print( "*" );
    }
    // spaces = 2*(n-1)
    for(int j = 1; j<=2 * (n - i); j++){
        System.out.print(" ");
    }
    // stars 
    for(int j=1; j<=i; j++){
        System.out.print("*");
    }
    System.out.println();
}
// 2nd half 
for(int i = n; i>=1 ; i--){
    // stars 
    for(int j=1; j<=i; j++){
        System.out.print( "*" );
    }
    // spaces = 2*(n-1)
    for(int j = 1; j<=2 * (n - i); j++){
        System.out.print(" ");
    }
    // stars 
    for(int j=1; j<=i; j++){
        System.out.print("*");
    }
    System.out.println();
}
       } 
       public static void main(String[] args) {
           butterfly_pattrn(3);
       }
           */
    /*     // solid rhombus 
          public static void solid_rhombus(int n){
            for(int i = 1; i<=n;i++){
                // spaces
                for(int j =1 ; j<=(n-i); j++){
                    System.out.print(" ");
                }
                // stars 
                for(int j=1; j<=n; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

          }
          public static void main(String args[]){
            solid_rhombus(3);
          }
            */  
            /* 
            public static void hollow_rhombus(int n){
                for(int i=1; i<=n; i++){
                // spaces
                for(int j=1; j<=(n-1); j++){
                    System.out.print(" ");
                }
                // hollow rectangle - stars
                for(int j =1; j<=n; j++){
                   if(i==1|| i==n || j==1|| j==n){
                    System.out.print("*");
                   } else {
                    System.out.print(" ");
                   }
                }
             System.out.println();   
            }
        }
            public static void main(String args[]){
                hollow_rhombus(7);
            }
*/
// 1st half 
public static void diamond_ptrn(int n) {
    for(int i =1; i<=n; i++){
        // spaces 
        for(int j =1; j<=(n-i); j++){
            System.out.print(" ");
        }
        // stars 
        for(int j = 1; j<=((2*i)-1) ; j++){
            System.out.print("*");
        }
        System.out.println();
    }


// 2nd half 

for(int i =n; i>=1; i--){
    // spaces 
    for(int j =1; j<=(n-i); j++){
        System.out.print(" ");
    }
    for(int j = 1; j<=((2*i)-1) ; j++){
        System.out.print("*");
    }
    System.out.println();
}

}
public static void main(String[] args) {
    
diamond_ptrn(4);
}
}


