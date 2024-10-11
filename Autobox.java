package String;
public class Autobox
{
	public static void main(String[] args)
	{
		int x=10;
		Integer i1=new Integer(x);
		System.out.println("Value of x="+i1);
		double d=23.89;
		Double d1=new Double(d);
		System.out.println("Value of d="+d1);
		
		Float f1=Float.Valueof(9.6f);
		System.out.println("Value of f1="+f1);
		double y1=d1.doubleValue();
		System.out.println("Value of y1="+y1);
		
		Integer i3=new Integer("25");
		System.out.println("Value of i3="+i3+i3);
		
		
	}
}