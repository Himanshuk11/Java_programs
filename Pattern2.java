package Basicprograms;
import java.util.*;
public class Pattern2
{

  public static void main(String[] args) {
    int i,j;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no.");
    int n=sc.nextInt();
    for(i=n;i>=0;i--)
    {
      for(j=1;j<=i;j++)
      {
          System.out.print((char)(i+64));
        
      }
      System.out.print(" ");
    }
  }
}