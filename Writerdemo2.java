package Filehandeling;
import java.io.*;
public class Writerdemo2
{
	public static void main(String[] args) throws IOException
	{
		String str; 
		  File f=new File("a2.txt"); 
		  f.createNewFile(); 
		  FileWriter fw=new FileWriter("a2.txt"); 
		  String txt="Welcome to Printwriter Class in Java"; 
		  PrintWriter pw=new PrintWriter(fw); 
		  pw.write(txt); 
		  pw.flush(); 
		  pw.close(); 
		  FileReader fr=new FileReader("a2, txt"); 
		  BufferedReader br=new BufferedReader(fr); 
		  System.out.println("File Contents are as follows:"); 
		  while((str=br.readLine())!=null) 
		  { 
		   System.out.println(str); 
		  }
	}
	
}