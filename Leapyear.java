/*Write a program to take year from user and find whether it is a leap year or not*/ 
package Basicprograms; 
import java.util.*; 
public class Leapyear 
{ 
  public static void main(String[] args) 
  { 
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter year"); 
    int year=sc.nextInt(); 
    if(year%4==0) 
      System.out.println("It is leap year."); 
    else 
      System.out.println("It is not a leap year:"); 
 
  } 
}