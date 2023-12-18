
package oop.finals;

class School {
      String name;
    
    public School (String name){
        this.name = name;  
    }
    void printSchool(){
        System.out.println (name + "(NBSC)");
}
 void printSAMESchool(){
        System.out.println (name + "(BSBA)");
}
 void printLAHISchool(){
        System.out.println (name + "(BSIT)");
}
 void printdifSchool(){
        System.out.println (name + "(TEP)");
}
}