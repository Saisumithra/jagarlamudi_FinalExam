/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam_8_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException, ArrayIndexOutOfBoundsException, IOException {
        // TODO code application logic here
        System.out.println("Answer For Question8:Saisumithra Jagarlamudi");
        FileReader file;
         try {
             file = new FileReader("ABC.txt");
             file.read();
            }
        catch(ArrayIndexOutOfBoundsException | FileNotFoundException e)
        {
             System.out.println("File Not Found:"+e);
        }
    }
}
