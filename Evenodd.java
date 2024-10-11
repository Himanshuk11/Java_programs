/*write program to display even and odd numbers from 1 to 100*/ 
package Basicprograms; 
import java.util.*; 
public class Evenorodd
{ 
  public static void main(String[] args) 
  { 
    int i; 
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter number."); 
    int n=sc.nextInt(); 
    System.out.println("Even numbers are as follow:-"); 
    for(i=1;i<=n;i++) 
    { 
      if(i%2==0) 
        System.out.println(i); 
    } 
    System.out.println("Odd numbers are as follow:-"); 
    for(i=1;i<=n;i++) 
    { 
      if(i%2!=0) 
        System.out.println(i); 
    } 
 
  } 
}