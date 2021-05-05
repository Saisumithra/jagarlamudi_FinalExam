/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam_1_2_2;

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
        System.out.println("Answer For Question1: Saisumithra Jagarlamudi");
        WristWatch hs = new WristWatch();
        SmartWatch sh = new SmartWatch();
        hs.brandname();
        hs.costofwatch();
        System.out.println("**********");
        sh.brandname();
        sh.costofwatch();
        sh.address();
    }
    
}
