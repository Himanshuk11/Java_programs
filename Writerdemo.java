package Filehandeling;
import java.io.*;
public class Writerdemo
{
	public static void main(String[] args) throws IOException
	{
		PrintWriter pw=new PrintWriter(System.out); 
		  pw.write("Data is follow"); 
		  pw.write("Welcome"); 
		  pw.flush(); 
		  pw.close();
	}
}