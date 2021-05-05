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
public class ChildrenBooks extends Books{
    private int numberofpages;
    private boolean istwosidesprinted;

    public ChildrenBooks(int numberofpages, boolean istwosidesprinted, double length, double width, double height, String authorname, double costperunit) {
        super(length, width, height, authorname, costperunit);
        this.numberofpages = numberofpages;
        this.istwosidesprinted = istwosidesprinted;
    }

    public int getNumberofpages() {
        return numberofpages;
    }

    public boolean isIstwosidesprinted() {
        return istwosidesprinted;
    }
    
    public double getvolume()
    {
        return getLength()*getWidth()*getHeight();
    }
    
    public double getprice()
    {
       return getvolume()*getCostperunit(); 
    }
}
