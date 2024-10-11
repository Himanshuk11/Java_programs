package Basicprograms;
import java.util.*;
public class Demo2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp;
		System.out.println("Before Swapping="+(a));
		System.out.println("Before Swapping="+(b));
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping="+(a));
		System.out.println("After Swapping="+(b));
		
	}
}