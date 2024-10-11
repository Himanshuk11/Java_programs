package Basicprograms;
import java.util.*;
public class fibonacciseries
{
	public static void main(String[] args)
	{
		int i,a=0,b=1,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		int n=sc.nextInt();
		for(i=1;i<n;i++)
		{
			System.out.print(c+","); 
		      a=b; 
		      b=c; 
		      c=a+b; 
		}
	}
}