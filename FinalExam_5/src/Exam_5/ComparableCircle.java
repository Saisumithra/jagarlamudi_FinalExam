/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam_5;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
    public class ComparableCircle extends Circle implements Comparable<ComparableCircle> 
    {
        public ComparableCircle(double radius) {
	     super(radius);
	}

        @Override 
	public int compareTo(ComparableCircle o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	@Override 
	public String toString() {
		return  "Area: " +getArea();
	}
}
