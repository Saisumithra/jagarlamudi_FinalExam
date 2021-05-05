/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam_9_1;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class Example {
    public void getDrivePermission(int age) throws ArithmeticException{
        if(age<18)
        {
            throw new ArithmeticException("Not eligible to drive");
        }else{
            System.out.println("Eligible to drive");
        }
    }
}
