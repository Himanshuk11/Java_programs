package OOPS;
public class Employeedetmain
{
    public static void main(String[] args) 
    {
        EmployeeDet emp1 = new EmployeeDet("Himanshu Kadu", 75000);
        EmployeeDet emp2 = new EmployeeDet("Vedant Kadu", 68000);
        EmployeeDet emp3 = new EmployeeDet("Om Deshmukh", 80000);
        
        System.out.println("Employee 1 Details:");
        emp1.displayEmployeeDetails();
        
        System.out.println("Employee 2 Details:");
        emp2.displayEmployeeDetails();
        
        System.out.println("Employee 3 Details:");
        emp3.displayEmployeeDetails();
        
        EmployeeDet.companyName = "Innovate Inc.";
        
        System.out.println("After changing company name:");
        
        System.out.println("Employee 1 Details:");
        emp1.displayEmployeeDetails();
        
        System.out.println("Employee 2 Details:");
        emp2.displayEmployeeDetails();
        
        System.out.println("Employee 3 Details:");
        emp3.displayEmployeeDetails();
    }
}