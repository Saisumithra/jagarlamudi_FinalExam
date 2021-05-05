/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam_1_2;

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
        System.out.println("Answer for Question 1:Saisumithra Jagarlamudi\n");
        ActionBooks hs = new ActionBooks();
        ThrillerBooks sh = new ThrillerBooks();
        sh.authorname();
        sh.priceofbook();
        hs.releaseyear();
    }
    
}
