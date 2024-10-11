package Exception;
import java.util.*;
public class ExceptionDemo
{
	void display()
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 2 Numbers: ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(b==0)
		    throw new ArithmaticException("Divide by zero not allowed" );
			else
			{
				System.out.println("Sum"+(a+b));

				System.out.println("Product"+(a+b));

				System.out.println("Difference"+(a-b));

				System.out.println("Divide"+(a/b));

			}
	
	}
}

	

