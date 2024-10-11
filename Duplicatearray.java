//wap java program to accept input from user and store the input in array and display the output
package Basicprograms;
import java.util.*;
public class Duplicatearray 
{

  public static void main(String[] args) {
    // declare an array
    int[]a=new int[100];
    int[]b=new int[100];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size:");
    int n=sc.nextInt();
    System.out.println("Enter array elements:");
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("original Array :");
    for(int i=0;i<n;i++)
    {
      System.out.println(a[i]);
    }  
    System.out.println("Copied Array :");
    for(int i=0;i<n;i++)
    {
      b[i]=a[i];
      System.out.println(b[i]);
    }  

  }

}