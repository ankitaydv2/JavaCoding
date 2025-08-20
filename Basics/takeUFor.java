import java.util.*;

public class takeUFor {
    public int countDigit(int n) {
       
    if(n>=0 && n<=9){
        System.out.print("1");
    }else if(n<=99){
    System.out.print("2");
    }
    else if(n<=999){
        System.out.print("3");
    }
    else if(n<=5000){
        System.out.print("4");
    }
    else{
        
    }
System.out.println();
}

    
}
public static   main (String args[]){
    takeUFor sol = new takeUFor();
    sol.countDigit();
}



