package Filehandeling;
import java.io.*;
public class ISRdemo
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter data: ");
		char ch=(char)br.read();
		System.out.println("Data is="+ch);
	}
}