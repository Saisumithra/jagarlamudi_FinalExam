/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam_1_1;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class CookingBooks extends Books {

    public CookingBooks(double length, double width, double height, String authorname, double costperunit) {
        super(length, width, height, authorname, costperunit);
    }
     public double getvolume() {
        return 98; 
    }

    @Override
    public double getprice() {
        return getvolume()*getCostperunit() ;
    }
    
    
    
}
