/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam_6_2;

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
        System.out.println("Answer For Question6 :Saisumithra Jagarlamudi");
        try {
	     int arr[] = { 34, 67, 8, 5, 2 };
	     System.out.println(arr[5]);
	    } catch (ArrayIndexOutOfBoundsException e) {
	     System.out.println(e);
	}
    }
}

      
        
    
    