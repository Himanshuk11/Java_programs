package Inheritance;
import java.util.*;
public class Employee1
{
	int empid;
	String empname;
	double salary;
	
	void acceptemp()
	{
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter id,name of employee: ");
				empid=sc.nextInt();
				empname=sc.next();
	}
}
		
//create a class employee with data members emp id emp name and salary create another class department with data members dep id, deo name and the department must perform aggregation with employee	