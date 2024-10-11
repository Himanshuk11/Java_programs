package OOPS;

import java.util.Scanner;

public class Book {
 int bid;
 String bname;
 int bno;
 
 Scanner sc=new Scanner(System.in);
 void accept()
 {
   System.out.println("Enter Department Id,Name,Number of employees working = \n");
   bid=sc.nextInt();
   bname=sc.next();
   bno=sc.nextInt();
 }
 void display()
 {
  System.out.println("Dept Details = \n");
  System.out.println("Dept Id = "+bid);
  System.out.println("\nDept Name = "+bname);
  System.out.println("\nEmployees working in the dept = "+bno);
 }
}