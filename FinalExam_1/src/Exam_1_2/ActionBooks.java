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
public class ActionBooks implements Books {
    private static final String authorname = "Jack Reacher";
    private static final String priceofbook = "5000";
    private static final String releaseyear = "2021";
    
    
    public void authorname()
    {
        System.out.println("Name of author :"+authorname);
    }
    
    public void priceofbook()
    {
         System.out.println("Price of book:"+priceofbook);
    }
    public void releaseyear()
    {
        System.out.println("year when book released:"+releaseyear);
        
    }
}