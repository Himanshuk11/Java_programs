package OOPS;
public class Dept
{
	int deptid;
	String deptname;
	Emp e;
	public Dept(int deptid, String deptname, Emp e)
	{
		super();
		this.deptid=deptid;
		this.deptname=deptname;
		this.e=e;
		
	}
	@Override
	public String toString() {
		return "Dept [deptid=" + deptid + ", deptname=" + deptname + ", e=" + e + "]";
	}
	
	
}