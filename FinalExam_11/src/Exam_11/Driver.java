/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam_11;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer For Question11:Saisumithra Jagarlamudi");
        //created an object obj1 for chocolate class
        Chocolate obj1 = new Chocolate("Ferrero Rocher",25);
        //created an object2 obj2 for chocolate class
        Chocolate obj2 = new Chocolate("Ferrero Rocher",30);
        System.out.println("Hash Code");
        //calculating hashcode values using hashcode method with object obj1
        System.out.println(obj1.hashCode());
        //calculating hashcode values using hashcode method with object obj2
        System.out.println(obj2.hashCode());
        System.out.println("**********");
        System.out.println("Equals");
        //comparing the objects using equals method for objects obj1 and obj2 
        System.out.println(obj1.equals(obj2));
        //comparing the objects using equals method by its name method for obj1 and obj2
        System.out.println(obj1.getName().equals(obj2.getName()));
    }
}

    
    

