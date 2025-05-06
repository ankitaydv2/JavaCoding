package Stringss;

public class concatenation {
    // two strings ko jodna (add) krna 
    public static void main(String[] args) {
     /*   // string concatentation
        String firstname = "tony";
        String lastname = "shark";
        String fullname = firstname + " " +lastname;
        //tony shark = space b count hoga
        System.out.println(fullname.length());

        //charAT
        for(int i =0 ; i<fullname.length(); i ++){
            System.out.println(fullname.charAt(i));
        }
*/ 
            // compare
         /*    String name1 = "tony";
            String name2 = "tony";
*/
            //1 s1 > s2 : +ve value 
            // s1 == s2 : 0
            //3 s1 < s2 : -ve value 

            // hello wello
            // aabello aahello to h is bda so bello jet gya

        /*     if(name1.compareTo(name2)==0){
                System.out.println("strings are equal");
            } else {
                System.out.println("Strings are not equal");
            }
                */ 
         /*   if(name1 == name2){
                System.out.println("strings are equal");
            } else {
                System.out.println("Strings are not equal");
            }
                */ 
       /*     if(new String("Tony")== new String ("Tony")){
                System.out.println("strings are equal");
            } else {
                System.out.println("Strings are not equal");
                /* == use krne pr wrong answer diye so
                 we use comapreTo for comparing the strings 
                 , bcz in some cases == give wrong ans  *//* 
                }  */
             
                //  SUBSTRINGS - Strings ka ek part ( Parsing Concept ) 
                // STRINGS ARE IMMUTABLE  as stringhs can't be changed 
                String sentence = "My name is Anku";
              //  substring(begindex, end index);
                String name = sentence.substring(4,7);
                System.out.println(name);

    }
}

