public class constructor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = " Ankita";
        s1.rollno = 28;
        s1.password = "abcd";
        s1.marks[0]= 100;
        s1.marks[1]= 90;
        s1.marks[2]= 80;

        Student s2 = new Student(s1); //copy
        s2.password = "xyz";
        s1.marks[2] = 100;
        for(int i =0 ; i < 3; i++){
            System.out.println(s2.marks[i]);
        }


      /*  Student s2 = new Student("Ankita");
        Student s3 = new Student(12);
     System.out.println();
      System.out.println(s2.name);
      System.out.println(s3.rollno);  */ 

    }
}
class Student {
    String name ; 
    int rollno;
    String password ;
    int marks[] ;

/*     // Shallow copy constructor
    Student(Student s1){
        marks = new int [3];
        this.name = s1.name ;
        this.rollno = s1.rollno;
        this.marks = s1.marks ;
    }  */

    // deep copy constructor
     Student(Student s1){
        marks = new int [3];
        this.name = s1.name ;
        this.rollno = s1.rollno;
        for(int i =0; i<marks.length ; i++){
        this.marks[i]= s1.marks[i];
        }
      }

     Student(){
        marks = new int[3]; // important   
      System.out.println("Constructor is called...");
    }
     Student(String name){
        this.name = name ; 
        //system.out.println();
      //  System.out.println("Constructor is called...");
    }
    Student(int rollno){
        this.rollno = rollno;
    }  
}
