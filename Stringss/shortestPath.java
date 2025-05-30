package Stringss;

public class shortestPath {
    // time complex - Linear O(n)
    public static float getShortestPath(String path) {
        int x =0 , y=0;

        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            //south y--
            if(dir == 'S'){
                y--;
            }
             //north y--
            else if(dir == 'N'){
                y++;
            }
             //east x++
             else if(dir == 'E'){
                x++;
            }
             //south x--
            else{
                x--;
            }
        } 
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);   
    }
    public static void main(String[] args) {
       // String path = "WNEENESENNN";
       String path = "WN";
        System.out.println(getShortestPath(path));
        
    }
}
