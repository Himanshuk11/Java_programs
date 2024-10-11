/*wap to design a class department with  
 * data members department id,name, no of emp working in that department  
 * accept the input from user and print the details of the department. */ 


package OOPS; 
 
import java.util.*; 
 
public class Department
{ 
  int depid; 
  String depname; 
  int noworker; 
   
  void accept() 
  { 
   Scanner sc =new Scanner(System.in); 
   System.out.println("Enter Department details:"); 
   depid=sc.nextInt(); 
   depname= sc.next(); 
   noworker=sc.nextInt(); 
    
    
  } 
  void display() 
  { 
   System.out.println("Department details are as follows:"); 
   System.out.println("ID="+depid+"\tName="+depname+"\tNo of worker="+noworker); 
  } 
  }