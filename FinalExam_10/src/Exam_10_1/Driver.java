/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam_10_1;

/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class Driver {

        public static int binarySearch(int arr[], int a, int b, int key){  
        if (b>=a){  
            int mid = a + (b - a)/2;  
            if (arr[mid] == key){  
            return mid;  
            }  
            if (arr[mid] > key){  
            return binarySearch(arr, a, mid-1, key); 
            }else{  
            return binarySearch(arr, mid+1, b, key); 
            }  
        }  
        return -1;  
    }  
    public static void main(String args[]){  
        int arr[] = {1,4,5,8,9};  
        int key = 5;  
        int last=arr.length-1;  
        int result = binarySearch(arr,0,last,key);  
        System.out.println("Answer For Question10: Saisumithra Jagarlamudi");
        System.out.println("Binary Search");
        if (result == -1)  
            System.out.println("Element is not found");  
        else  
            System.out.println("Element is found at index: "+result);  
    }  
}  
    
