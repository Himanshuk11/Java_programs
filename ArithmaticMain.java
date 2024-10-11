package OOPS;
import java.util.*;
public class ArithmaticMain
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 nos: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		Arithmetics a1=new Arithmetics();
		a1.adds(a,b);
		a1.adds(a,b,c);
		
		a1.adds(12.9f,10,12);
		a1.main();
		
	}
}