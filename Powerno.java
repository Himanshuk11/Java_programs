package Basicprograms;
import java.util.*;
public class Powerno
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base and exponent: ");
		int b=sc.nextInt();
		int e=sc.nextInt();
		int power=1,i;
		
		for(i=1;i<=e;i++)
		{
			power=power*b;
			
		}
		System.out.println("power is"+power);
		
			
	}
}