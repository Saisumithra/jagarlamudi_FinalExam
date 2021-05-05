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
public class SmartWatch implements Watches {
    private static final String brandname="Timex";
    private static final String costofwatch="980";
    private static final String address="Nashville"; 
    
    
    public void brandname()
    {
        System.out.println("Brand Name:"+brandname);
    }

    @Override
    public void costofwatch() {
         System.out.println("Cost of The Watch:"+costofwatch);
    }
    public void address()
    {
        System.out.println("Place Where we purchased the watch:"+address);
        
    }
}

