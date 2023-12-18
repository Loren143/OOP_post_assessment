
package oop.finals;
import java.util.Scanner;

public class Program extends School{

    private int programNumber;
 public Program (String name){
        super(name);
 }
        void printProgramName(){
            Scanner scanner = new Scanner (System.in);
          System.out.println ("1.BSIT");
           System.out.println ("2.BSBA");
            System.out.println ("3.TEP");
        System.out.println ( name + "Enter Program number:") ;
        
      //  String programName = scanner.nextLine();
        
        //System.out.println( "Bachelor of Science in Information Technology") ;
         
        // scanner.close();
     switch (programNumber){
         case 1:
             System.out.println( "Bachelor of Science in Information Technology");
             break;
               case 2:
             System.out.println( "BSBA");
             break;
               case 3:
                   System.out.println( "TEP");
               default:
                    System.out.println( "invalid program number entered");
                    break;
                    scanner.close();
     }
         
        }                  
}
   


