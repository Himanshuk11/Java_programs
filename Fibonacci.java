/*Write a program to print fibonacci series upto n terms*/ 
package Basicprograms; 
import java.util.*; 
public class Fibonacci
{ 
  public static void main(String[] args) 
  { 
    int i,a=0,b=1,c=0; 
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter the range of series."); 
    int n=sc.nextInt(); 
    for(i=1;i<=n;i++) 
    { 
      System.out.print(c+","); 
      a=b; 
      b=c; 
      c=a+b; 
    } 
  } 
}