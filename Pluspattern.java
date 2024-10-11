package Basicprograms;
import java.util.*;
public class Pluspattern
{

  public static void main(String[] args)
  {    
    int i,j;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number.");
    int m=sc.nextInt();
    for(i=1;i<=2*m-1;i++)
    {
      for(j=1;j<2*m-1;j++)
      {
        if(i==5||j==5)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println(" ");
    }    
  }
}