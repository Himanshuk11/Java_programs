//Write a program to take input from user for empId , name, salary and print the Employee Details.*/ 
package Basicprograms; 
import java.util.*; 
public class Employeeid 
{ 
  public static void main(String[] args) 
  { 
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter Employee id,name,salary."); 
    int eid=sc.nextInt(); 
    String name=sc.next();     
    float sal=sc.nextFloat(); 
    System.out.println("Employee id="+eid+"  Employee name ="+name+"  Employee Salary="+sal); 
     
  } 
}