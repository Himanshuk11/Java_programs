package Array;
import java.util.*;
public class Arraydemo2
{
	public static void main(String[] args)
	{
		int[] a=new int[100];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are as follows: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}