package OOPS;
public class EmployeePer extends PersonEmp {
 private String employeeId;
 
 public EmployeePer(String name, int age, String employeeId) {
     super(name, age);
     this.employeeId = employeeId;
 }
 
 public void displayEmployeeDetails() {
     displayPersonDetails();
     System.out.println("Employee ID: " + employeeId);
 }
}
