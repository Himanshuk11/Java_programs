package Array;
import java.util.*;
public class Arraydemo4
{
	public static void main(String[] args)
	{
	 
		int[] a=new int[100];
		Scanner sc=new Scanner(System.in);
		System.out.prinln("Enter array size: ");
		int n=sc.nextInt();
		
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextint();
			
		}
		System.out.println("Array elements are as follows: ");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}