/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam_11;

import java.util.Objects;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class Chocolate {
    private String name;
    private int price;

    /**
     * constructor with name and price
     * @param name
     * @param price
     */
    public Chocolate(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /**
     * to access name of chocolate
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * to modify the name of chocolate
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * to access price of chocolate
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * to modify the price of chocolate
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chocolate{" + "name=" + name + ", price=" + price + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Chocolate other = (Chocolate) obj;
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
}
