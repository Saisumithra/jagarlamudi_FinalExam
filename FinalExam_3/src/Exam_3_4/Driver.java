/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam_3_4;

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
        System.out.println("Answer For Question3:Saisumithra Jagarlamudi");
        System.out.println("UP CASTING");
        Bags b = new Bags("Prada", 5423);
        System.out.println(b.getBagDetails());
        Bags b1 = new TravelBags(3,"Louis Vuitton",3456);
        System.out.println(b1.getBagDetails());
        BackPack bp = new BackPack("Maryville","Chanel",3456);
        System.out.println(bp.getBagDetails());
        Bags b2 = new BackPack("Missouri","Kate Spade",765644);
        System.out.println(b2.getBagDetails());
    }
}
    

