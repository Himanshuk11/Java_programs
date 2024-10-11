package Basicprograms;
import java.util.*;
public class elseifno
{
	public static void main(String[] arge)
	{
		Scanner sc=new Scanner(System.in)System.out.println("Enter 3 nos: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b && a<c)
			System.out.println("A is minimum"+a);
		else
			System.out.println("B is minimum"+b);
		else
			System.out.println("C is minimum"+c);
					
	}
}