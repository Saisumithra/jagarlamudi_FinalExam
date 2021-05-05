/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam_12;
import java.util.*;
/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class EmployeeDriver {
    
public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		Employee emp1 = new Employee(2, "Sumithra", 50000);
		Employee emp2 = new Employee(1, "Harish", 500);
		Employee emp3 = new Employee(3, "Pridhvi", 450);
		Employee emp4 = new Employee(5, "Rupa", 25000);
		Employee emp5 = new Employee(4, "Pranesh", 850000);
                empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
                System.out.println("Answer For Question10:Saisumithra Jagarlamudi");
		System.out.println("Original order");
		for (Employee emp : empList)
		System.out.println(emp);
                System.out.println("************");
                System.out.println("Sorted order by using Collections sort");
                Collections.sort(empList);
                for(Employee emp :empList)
                {
                    System.out.println(emp);
                }
                Collections.sort(empList, new Comparator<Employee>() 
                {
                   @Override
                   public int compare(Employee emp1, Employee emp2) 
                   {
                    return Double.compare(emp1.getEmpSalary(),emp2.getEmpSalary());
                   }   
                });
                System.out.println("************");
                System.out.println("sorting based on employee salary ");
                for(Employee emp:empList){
                    System.out.println(emp);
                }
                Collections.sort(empList, new Comparator<Employee>() 
                {
                  @Override
                  public int compare(Employee emp1, Employee emp2) 
                  {
                   return emp1.getEmpName().compareTo(emp2.getEmpName());
                  }  
                 });
                 System.out.println("************");
                 System.out.println("sorting based on employee name ");
                 for(Employee emp : empList){
                     System.out.println(emp);
                 }
                }
}

  