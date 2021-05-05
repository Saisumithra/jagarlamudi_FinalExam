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
public class Bags {
      private String brandname;

    private int price;

    public Bags(String brandname, int price) {
        this.brandname = brandname;
        this.price = price;
    }

    public String getBrandname() {
        return brandname;
    }

    public int getPrice() {
        return price;
    }
    
    public String getBagDetails()
    {
        return getBrandname()+ " " + getPrice();
    }

    @Override
    public String toString() {
        return "Bags{" + "brandname=" + brandname + ", price=" + price + '}';
    }
}
