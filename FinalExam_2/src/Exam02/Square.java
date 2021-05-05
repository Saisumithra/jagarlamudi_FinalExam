/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class Square extends GeometricObject implements Colorable {
	private double side;
        
        public Square(){
        }
        public Square(double side) {
            this.side = side;
        }

        public double getSide() {
		return side;
	}

	@Override
	public double getArea() {
		return side * side;
	}

	@Override
	public void howToColor() {
		System.out.println( "Color all four sides");
	}

	@Override
	public String toString() {
		return super.toString() + "\nSide: " + side + "\nArea: " + getArea();
			
	}
}