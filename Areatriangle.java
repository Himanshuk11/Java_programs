/*Write a program to calculate the area of triangle. Ask input from user (0.5*base*height)*/ 

package Basicprograms; 
import java.util.*; 
public class Areatriangle
{ 
  public static void main(String[] args) 
  { 
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter base and height"); 
    int base=sc.nextInt(); 
    int height=sc.nextInt(); 
    System.out.println("Area of Triangle ="+(0.5*base*height)); 
     
  } 
}