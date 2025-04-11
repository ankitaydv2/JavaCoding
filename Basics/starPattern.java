public class starPattern {
    public static void main(String argd[]){
        /* for(int line = 1 ; line<=4 ; line++){
            for (int star = 1 ; star<=line ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    */
    /* INVERTED STAR PATTERN x
    int n = 8;
for(int line = 1; line<=n; line++){
    for(int star=1; star<=n-line+1; star++){
System.out.print("*");
    }
    System.out.println();
}
    */
    /* HALF PYRAMID PATTERN 
    int n =4;
    for(int line =1 ; line<=n; line++){
        for(int num = 1 ; num<=line; num ++){
            System.out.print(num);
        }
        System.out.println();
    }
        */
        /* print CHARACTER PATTERN */
        int n =4;
        char ch = 'A';
        // outer loop 
        for (int  line = 1; line<=n; line ++){
            // inner loop
            for(int b = 1 ; b <= line; b ++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }


}
}
