/*Write a program check whether given number is armstrong number or not*/ 
package Basicprograms; 
import java.util.*; 
public class Armstrongno
{ 
  public static void main(String[] args) 
  { 
    int rem=0,rev=0,term; 
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter a number:"); 
    int num=sc.nextInt(); 
    term=num; 
    while(num!=0) 
    { 
      rem=num%10; 
      rev=rev+(rem*rem*rem); 
      num=num/10; 
       
    } 
    if(term==rev) 
      System.out.println("It is armstrong number."); 
    else 
      System.out.println("It is not a armstrong number."); 
  } 
}