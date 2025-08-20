public class inheritence {
    public static void main(String args[]){
        //Fish shark = new Fish();
        //shark.eat();
      /*  Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
        }*/ 
      /*  Bird hew = new Bird();
        hew.fly();  */ 

        Fish t = new Fish();
        t.swims();
         Tuna T1 = new Tuna();
         T1.shape();
         T1.swims();
         Shark T2 = new Shark();
         T2.shape();
    }
}

// base class
// multilevel inheritence 
// hierarchial inheritence


/*class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
     void breaths(){
        System.out.println("breaths");
    }
}

class Mammal extends Animal{
    void walks(){
        System.out.println("walks");
    }
   // int legs;
}
class Bird extends Animal{
    void fly(){
         System.out.println("fly");
    }
}

class Fish extends Animal{
    void swims(){
     System.out.println("swims");
    }
    
}  */


/*class Dog extends Mammal{
    String breed;
}
/* // derived class 
class Fish extends Animal{
    int fins;

    void swims(){
        System.out.println("swims");
    } 
}  */
  class Animal{
    void eat(){
        System.out.println("eats");
    }
     void breaths(){
        System.out.println("breaths");
    }
}

class Fish extends Animal{
    void swims(){
        System.out.println("Swims");
    }
}
class Tuna extends Fish{
    void shape(){
        System.out.println("bony fish");
    } 
}
class Shark extends Fish{
    void shape(){
        System.out.println("badi fish");
    } 
}

class Bird extends Animal{
    void fly(){
        System.out.println("flies");
    }
}
class peacock extends Bird{
    void features(){
        System.out.println(" blue & green long feathers");
    }
}

class Mammals extends Animal{
    void walk(){
        System.out.println("walk");
    }
}
class dog extends Mammals{
    void voice(){
        System.out.println("bark");
    }
}
class cat extends Mammals{
    void voice(){
        System.out.println("meow");
    }
}
class Humans extends Mammals{
    void voice(){
        System.out.println("talk");
    }
}
