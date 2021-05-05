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
public class WristWatch implements Watches{
   
    private static final String brandname="Fossil";
    private static final String costofwatch="2500";
    
    
    public void brandname()
    {
        System.out.println("Brand Name:"+brandname);
    }

    @Override
    public void costofwatch() {
         System.out.println("Cost of watch:"+costofwatch);
    
    }
}
 

