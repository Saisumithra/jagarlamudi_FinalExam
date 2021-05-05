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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ComparableCircle comparableCircle1 = new ComparableCircle(97);
	ComparableCircle comparableCircle2 = new ComparableCircle(98);
        System.out.println("ComparableCircle1");
        System.out.println(comparableCircle1);
        System.out.println("**********");
        System.out.println("ComparableCircle2");
        System.out.println(comparableCircle2);
        System.out.println("**********");
        System.out.println((comparableCircle1.compareTo(comparableCircle2) == 1 ? "ComparableCircle1 " : "ComparableCircle2 ") + 
			"is the larger of the two Circles");
	}
    }
    

