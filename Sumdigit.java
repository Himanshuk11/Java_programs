/*Write a program to find the sum of digits of a number*/ 

package Basicprograms; 
import java.util.*; 
public class Sumdigit 
{ 
  public static void main(String[] args) 
  { 
    int sum=0,rem; 
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter a number:"); 
    int n=sc.nextInt(); 
    while(n!=0) 
    { 
      rem=n%10; 
      n=n/10; 
      sum=sum+rem; 
    } 
    System.out.println("Sum of digits ="+sum); 
  } 
}