package OOPS;
import java.util.*;
public class Bookmain 
{

 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter how many books details to be entered = \n");
  int n=sc.nextInt();
  
  Book []b=new Book[n];
  
  for(int i=0;i<n;i++)
  {
   b[i]=new Book();
   b[i].accept();
   b[i].display();
  }
 }

}