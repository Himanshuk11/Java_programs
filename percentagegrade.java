package Basicprograms;
import java.util.*;
public class percentagegrade
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 sub marks:");
		int sub1=sc.nextInt();
		int sub2=sc.nextInt();
		int sub3=sc.nextInt();
		float per=sc.nextInt();
		int sum=(sub1+sub2+sub3);
		per=(sum/300)*100;
		if(per>=70)
			System.out.println("Grade A");
		else if(per>=50 && per<70)
			System.out.println("Grade b");
	
	}
}