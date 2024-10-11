package OOPS;
public class Employeepersonmain
{
 public static void main(String[] args) 
 {
     PersonEmp person = new PersonEmp("Himanshu Kadu", 24);
     
     EmployeePer employee = new EmployeePer("Vedant Kadu", 19, "E12345");
     
     System.out.println("Person Details:");
     person.displayPersonDetails();
     
     System.out.println("\nEmployee Details:");
     employee.displayEmployeeDetails();
 }
}
