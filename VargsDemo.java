package OOPS;
class DemoArgs
{
	void show(int ...x)
	{
		for(int i:x)
		{
			System.out.println(i);
		}
		
	}
}
public class VargsDemo
{
 public static void main(String[] args)
 {
	 DemoArgs a1=new DemoArgs();
	 System.out.println("Arguments are as follows: ");
	 a1.show();
	 a1.show(1,2,3);
	 a1.show(10,20,30,40,50);
	 a1.show(9,8,6,4,2,1);
	 
 }
}