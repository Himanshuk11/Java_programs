package OOPS;
public class AgregateMain
{
	public static void main(String[] args)
	{
		Emp e1=new Emp(101,"Himanshu",28000);
		Emp e2=new Emp(102,"Vedant",30000);
		
		Dept d1=new Dept(1,"CSE",e1);
		Dept d2=new Dept(2,"Architect",e2);
		

		System.out.println(e1);

		System.out.println(e2);

		System.out.println(d1);
	
		System.out.println(d1);

}
}