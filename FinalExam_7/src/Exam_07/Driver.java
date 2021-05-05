/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam_07;
 
import java.util.*;
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
        System.out.println("Answer For Question7 :Saisumithra Jagarlamudi");
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000) + 1;
        }
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array index:");
        try {
            System.out.println("The corresponding element value are " + arr[input.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }
    }

}
