/*Write a program to check whether given number is prime number or not.*/ 
package Basicprograms; 
import java.util.Scanner; 
public class Primeno 
{ 
  public static void main(String[] args) 
  { 
    int count=0,i; 
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter a number:"); 
    int n=sc.nextInt(); 
    for(i=1;i<=n;i++) 
    { 
      if(n%i==0) 
        count++; 
    } 
    if(count==2) 
      System.out.println("It is prime number."); 
    else 
      System.out.println("It is not a prime number."); 
  } 
}