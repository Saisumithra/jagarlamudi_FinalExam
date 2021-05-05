/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam_9_1;

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
        System.out.println("Answer For Question9: Saisumithra Jagarlamudi");
        try{
            Example e = new Example();
            e.getDrivePermission(25);
        }catch(ArithmeticException e){
            System.out.println(e);
            
        }
    }
    
}
