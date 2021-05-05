/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam_10_2;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    static int linearSearch(int a[], int start, int end, int key) {
        if (start > end) {
            return -1;
        } else if (a[start] == key) {
            return start;
        } else if (a[end] == key) {
            return end;
        }
        return linearSearch(a, start+1, end-1, key);
    }
    public static void main(String[] args) {
        int[] a = {25, 65, 67, 76, 43, 99};
        int index = linearSearch(a, 0, a.length-1,99);
        System.out.println("Answer For Question10:Saisumithra Jagarlamudi");
        System.out.println("Linear Search");
        if (index != -1) {
           System.out.println(99 + " is at index " + index);
        }
        else {
            System.out.println(99 + " is not present");
        }
    }    
}
    
