package Inheritance;
public class CastingDemo
{
	public static void main(String[] args)
	{ 
	    Child c1=new Child();
		c1.display();
		
		Parents p1=(Parents)new Child();//upcasting
		p1.display();
		
		Child c1=(Child)p1;//downcasting
		c1.display();
	}
}