/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02;

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
        System.out.println("Answer For Question2 : Saisumithra Jagarlamudi");
        GeometricObject[] hs = {new Square(9), new Square(12), new Square(15), new Square(20), new Square(25)};
        for (int i = 0; i < hs.length; i++)
        {
	   System.out.println("\nSquare: " + (i + 1));
           System.out.println("Area: " + hs[i].getArea());
           if(hs[i] instanceof Colorable){
               ((Colorable)hs[i]).howToColor();
           }
        } 
    }
}
    
