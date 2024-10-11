package Exception;
import java.util.*;
public class Arithmatic
{
	Scanner sc=new Scanner(System.in);
	int a,b;
	

		void accept()
		{
			try
			{
				System.out.println("Enter 2 nos:");
				a=sc.nextInt();
				b=sc.nextInt();
				
				System.out.println("Sum of 2 nos:"+(a+b));
				System.out.println("Division of 2 nos:"+(a/b));
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("In finally!!");
			}
		}
}
