package OOPS;
public class Emp
{
	int empid;
	String name;
	double sal;
	
	public Emp(int empid, String name, double sal)
	{
		super();
		this.empid=empid;
		this.name=name;
		this.sal=sal;
	}

	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", name=" + name + ", sal=" + sal + "]";
	}
	
}