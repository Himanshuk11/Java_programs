package DesignPattern;
public class Singleton
{
	public static Singleton obj;
	
	private Singleton()
	{
		System.out.println("Inside songle tone constructor" );
		
	}
	static Singleton getInstance()
	{
		if(obj==null)
		{
			obj=new Singleton();
			System.out.println("1st object is created");
		}
		else
		{
			System.out.println("No object is created");
		}
		return obj;
	}
}
