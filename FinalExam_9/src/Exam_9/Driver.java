/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam_9;

import java.util.Scanner;
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
        Scanner scan = new Scanner(System.in);
        System.out.println("Answer For Question9:Saisumithra Jagarlamudi");
        System.out.println("Enter a number");
        int value =scan.nextInt();
        if(value<=0)
        {
            throw new ArithmeticException("we cannot calculate negative values");
        }
        System.out.println(Math.cbrt(value));
    }
}

