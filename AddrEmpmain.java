package OOPS;

public class AddrEmpmain {
 public static void main(String[] args) {
     // Create an Address object
     Address address = new Address("San Francisco", "California", "94105");
     
     // Create an Employee object with the Address object
     EmployeeAddress employee = new EmployeeAddress("Alice Johnson", 75000.00, address);
     
     // Display the employee details
     employee.displayEmployeeDetails();
 }
}
