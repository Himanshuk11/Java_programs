package Basicprograms;

import java.util.Scanner;
public class Temp
{

	public static void main(String[] args) 
	{
		        double c;
		        
		        Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter temperature in celsius =");
				c=sc.nextDouble();
				
		        double f = (c * 9/5) + 32;
		        System.out.println("After converting celsius to fahrenheit the value is " + f);
	}

}

