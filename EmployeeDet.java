package OOPS;
public class EmployeeDet {
    
    static String companyName = "Tata Motors";
    
  
    String name;
    double salary;
    
    
    public EmployeeDet(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
   
    public void displayEmployeeDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + companyName);
        System.out.println(); 
    }
}
