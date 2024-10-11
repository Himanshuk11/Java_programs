package Basicprograms;
import java.util.*;
public class Oddpattern
{
  public static void main(String[] args) {
    int i,j;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no.");
    int n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=i;j++)
      {
        if(i%2!=0)
          System.out.print("*");
        
      }
      System.out.println(" ");
    }
  }
}