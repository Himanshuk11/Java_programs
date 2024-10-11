//12345 
//23451 
//34512 
//45123 
//51234 
 
package Basicprograms; 
import java.util.*; 
public class Patternhw2 
{ 
 
  public static void main(String[] args)  
  { 
    int i,j; 
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter a number."); 
    int n=sc.nextInt(); 
    for(i=1;i<=n;i++) 
    { 
      for(j=i;j<=n;j++) 
      { 
        System.out.print(j); 
      } 
      for(j=1;j<=i-1;j++) 
      { 
       System.out.print(j);   
      } 
      System.out.println(" "); 
    } 
  } 
}