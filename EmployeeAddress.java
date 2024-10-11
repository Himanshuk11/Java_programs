package OOPS;
public class EmployeeAddress
{
 private String name;
 private double salary;
 private Address address; 
 public EmployeeAddress(String name, double salary, Address address) {
     this.name = name;
     this.salary = salary;
     this.address = address; 
 }
 
 public void displayEmployeeDetails() {
     System.out.println("Name: " + name);
     System.out.println("Salary: " + salary);
     System.out.println("Address:");
     address.displayAddress(); 
 }
}
