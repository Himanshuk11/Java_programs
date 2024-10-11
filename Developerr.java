package Inheritance;

import java.util.Scanner;

public class Developerr extends Employe
{
  String projname;
  double salary;
  
  void accept()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the details:");
    System.out.println("Enter Id,Name,Address,ProjName,Salary");
    id=sc.nextInt();
    name=sc.next();
    address=sc.next();
    projname=sc.next();
    salary=sc.nextDouble();

  }
  
  void display()
  {
    System.out.println("Detail are as follow:");
    System.out.println("Id="+id+"\tName="+name+"\tAddress="+address+"\tProjName="+projname+"\tSalary="+salary);
  }
}