/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam_6_1;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        System.out.println("Answer For Question6 :Saisumithra Jagarlamudi");
        try {
            FileReader file1 = new FileReader("Textfile.txt");
            FileReader file2;
        } catch (FileNotFoundException ex) {
            System.out.println("File not found exception" + ex);
        }
    }
}
    

