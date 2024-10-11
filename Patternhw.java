//54321 
//4321 
//321 
//21 
//1 
 
package Basicprograms; 
import java.util.*; 
public class Patternhw 
{ 
 
  public static void main(String[] args)  
  { 
    int i,j; 
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter a number."); 
    int n=sc.nextInt(); 
    for(i=n;i>0;i--) 
    { 
      for(j=i;j>0;j--) 
      { 
        System.out.print(j); 
      } 
      System.out.println(" "); 
    } 
  } 
}