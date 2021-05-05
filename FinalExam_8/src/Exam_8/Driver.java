/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam_8;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws ArithmeticException, ArrayIndexOutOfBoundsException {
        // TODO code application logic here
        System.out.println("Answer For Question8: Saisumithra Jagarlamudi");
        try {
            int a[] = new int[10];
            a[3]=6/0;
        }catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception Occurs");
        }catch(ArrayIndexOutOfBoundsException e)
        {
             System.out.println("Array Index out of Bounds Exception");
        }
    }
}
