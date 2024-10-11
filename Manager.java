package OOPS;

public class Manager {
  int m_id;
  String name,proj_name;
  double salary;
  
  Manager()
  {
    
    m_id=101;
    name="Himanshu";
    proj_name="Grocery store management system";
    salary=75000;
    
  }
 
  Manager(int m_id,String name,String proj_name,double salary)
  {
    System.out.println("Invoke default constructor.");
    this.m_id=m_id;
    this.name=name;
    this.salary=salary;
    this.proj_name=proj_name;
  }
  void display()
  {
    System.out.println("Car Details area as follow:");
    System.out.println("M_id="+m_id+"\tName="+name+"\tSalary="+salary+"\tProj_name="+proj_name);
  }
}




//write a java program to design a class manager with data members manager id, manager name, salary, project name,
//accpet the input ftom user and display the detail using the concept of constructer 