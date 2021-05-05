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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        System.out.println("Answer For Question1: Saisumithra Jagarlamudi\n");
        VegetarianBooks sh = new VegetarianBooks(2,3,4,"Jamie Oliver",25);
        sh.getprice();
        sh.getAuthorname();
        sh.getvolume();
        
        ChildrenBooks hs = new ChildrenBooks(500,true,4,1,2,"Ronald Dahl",5);
        hs.isIstwosidesprinted();
        hs.getNumberofpages();
        hs.getvolume();
        hs.getprice();
        
        System.out.println("Author of Book:"+sh.getAuthorname());
        System.out.println("Price of the book:"+sh.getprice());
        System.out.println("Volume of the book:"+sh.getvolume());
        System.out.println("*****************");
        System.out.println("Is book two side printed: "+hs.isIstwosidesprinted());
        System.out.println("Price of book:"+hs.getprice());
        System.out.println( "Volume of book:"+hs.getvolume());
        System.out.println("Number of pages in book:"+hs.getNumberofpages());
    }
}

    

