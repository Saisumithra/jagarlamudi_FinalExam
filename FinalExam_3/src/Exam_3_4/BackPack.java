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
public class BackPack extends Bags{
  private String address;

    public BackPack(String address, String brandname, int price) {
        super(brandname, price);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getBagDetails(){

        return getAddress()+" "+super.getBagDetails();   
    }
    
    @Override
    public String toString() {
        return super.toString()+"BackPack{" + "address=" + address + '}';
    }
}

   