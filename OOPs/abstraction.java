public class abstraction {
    public static void main(String args[]){
        Mustang m = new Mustang();
        // Animal -> Horse -> Mustang   -> Constructor b aise hi call honge in hiearchy form mai

      /*   Horse h = new Horse();
        h.eat();
        h.walk();
         System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println( c.color);
        */

    }
}

abstract class Animal{
    String color; 

    Animal(){
      System.out.println("animal constructor called");
        color = "brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk(); // here it gives idea of walk not implementation 
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color = " dark brown";
    }
    void walk(){
       System.out.println("walks in 4 legs"); 
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = " red";
    }
    void walk(){
        System.out.println("walks in 2 legs");
    }
}