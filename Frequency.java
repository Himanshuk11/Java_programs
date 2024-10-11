package Array;
import java.util.*;
public class Frequency
{

  public static void main(String[] args) {
    int[]a=new int[100];
    int cnt=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size:");
    int n=sc.nextInt();
    System.out.println("Enter array elements:");
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    
    }
    System.out.println("Array elements are as follow:");
    for(int i=0;i<n;i++)
    {
      System.out.println(a[i]);
    }
    System.out.println("Enter a number you want to search:");
    int num=sc.nextInt();
    
    for(int i=0;i<n;i++)
    {
    	if(a[i]==num)
    		cnt++;
    }
    System.out.println("Frequency is"+cnt);
  }
}

