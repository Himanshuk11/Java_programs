package Basicprograms;
import java.util.*;
public class Starpattern
{

  public static void main(String[] args) {
    int i,j;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number.");
    int n=sc.nextInt();
    for(i=n;i>0;i--)
    {
      for(j=1;j<=i;j++)
      {
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }

}