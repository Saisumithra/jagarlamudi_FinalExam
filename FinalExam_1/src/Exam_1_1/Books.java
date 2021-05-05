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
public abstract class Books {
    private double length;
    private double width;
    private double height;
    private String authorname;
    private double costperunit;

    public Books(double length, double width, double height, String authorname, double costperunit) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.authorname = authorname;
        this.costperunit = costperunit;
    }
    
    public abstract double getprice();
    public abstract double getvolume();
    
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getAuthorname() {
        return authorname;
    }

    public double getCostperunit() {
        return costperunit;
    }
    
}
