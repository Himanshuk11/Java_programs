package Basicprograms;
import java.util.*;
public class Month
{
	public static void main(String[] args)
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Below are the Choices:");
	System.out.println("1:Jan,2:Feb,3:March,4:April,5:May,6:June,7:July,8:Aug,9:Sep,10:Oct,11:Nov,12:Dec");
	System.out.println("Enter the choice:");
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
	System.out.println("It has 31 days:");
	break;
	case 2:System.out.println("It has 29/29 days");
	break;
	case 4:
	case 6:
	case 9:
	case 11:
		System.out.println("It has 30 days:");
		break;
		default:System.out.println("Invalid choice:");
		break;
	
	}
	

	}

}

 
