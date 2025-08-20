public class oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());
    
    }
}
/* 
class BankAccount{
    public String  username;
    private String password;
    public void setPassword(String pwd ){;
    password = pwd;
    }
}
*/
class Pen {
    private String color;
    private int tip;// pen k ander ka  tip h 

    String getColor(){ // getters
        return this.color;
     // this is special keyword in java  i.e, current obj k liye 

    }
    void getColor(String newColor){
        this.color = newColor;
    }
    
    void setColor(String newColor){ // setters 
        color = newColor;
    }
    int getTip(){
        return this.tip;

    }

    void getTip(int newTip){
        this.tip = newTip;
    }
    void setTip(int newTip){ // or idhr jo tip h vo new tip pass ki h 
        tip = newTip;
    }
}
class Student {
    String name ;
    int age ;
    float percentage ; //cgpa

    void calPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math)/3;
    }

}
    

