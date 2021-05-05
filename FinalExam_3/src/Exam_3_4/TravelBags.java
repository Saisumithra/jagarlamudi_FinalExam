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
public class TravelBags extends Bags{
    private int wheels;

    public TravelBags(int wheels, String brandname, int price) {
        super(brandname, price);
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public String getBagDetails(){

        return super.getBagDetails()+" " +getWheels();      

    }


    @Override
    public String toString() {
        return super.toString()+ "TravelBags{" + "wheels=" + wheels + '}';
    }
}


