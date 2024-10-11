package OOPS;

public class Employee1
{
	int empid;
	String name;
	float sal;

	void accept()
	{
		empid=101;
		name="Himanshu";
		sal=50000;
	}
	void display()
	{
		System.out.println("Employee Details are as follows: ");
		System.out.println("ID="+empid+"\tName="+name+"\tSal="+sal);
	}
}

