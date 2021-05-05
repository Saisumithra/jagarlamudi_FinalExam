/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam_10;

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
        String string = "Sumithra";
        String string2 = "radar";
        System.out.println("Answer For Question10: Saisumithra Jagarlamudi");
        if (isPalindrome(string))
		System.out.println(string + " is a palindrome");
		else
		System.out.println(string + " is not a palindrome");
        
	if (isPalindrome(string2))
		System.out.println(string2 + " is a palindrome");
		else
		System.out.println(string2 + " is not a palindrome");
    }
    public static boolean isPalindrome(String s) 
        {
        if (s.length() == 0 || s.length() == 1)
        return true;
        if (s.charAt(0) == s.charAt(s.length() - 1))
	return isPalindrome(s.substring(1, s.length() - 1));
        return false;
        }
}
    

