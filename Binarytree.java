/* 
1 
01 
101 
0101 
10101 
*/ 
package Basicprograms; 
import java.util.*; 
public class Binarytree 
{ 
  public static void main(String[] args) 
  { 
    int i,j; 
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter no."); 
    int n=sc.nextInt(); 
    for(i=1;i<=n;i++) 
    { 
      for(j=1;j<=i;j++) 
      { 
        if((i+j)%2==0) 
        { 
          System.out.print(1); 
        } 
        else 
        { 
          System.out.print(0); 
        } 
      } 
      System.out.println(" "); 
    } 
  } 
}