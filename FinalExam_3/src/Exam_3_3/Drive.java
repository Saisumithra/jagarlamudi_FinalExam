/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam_3_3;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class Drive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer For Question3:Saisumithra Jagarlamudi");
        System.out.println("DOWN CASTING");
        Bags hs=new Bags("American Tourist",5425);
        System.out.println(hs.getBagDetails());
        TravelBags sh =new TravelBags( 2,"Nashville",3456);
        System.out.println(sh.getBagDetails()); 
        hs=sh;
        sh=(TravelBags)hs;//Casting
        System.out.println(sh.getBagDetails());
    }
}
    
