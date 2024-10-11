package Filehandeling;
import java.io.*;
public class ISRdemo3
{
	public static void main(String[] args)throws IOException
	{
		String ch;
		FileReader fr=new FileReader("\"C:\\Users\\user\\eclipse-workspace\\javaaugust\\src\\a1.txt\"");
		BufferedReader br=new BufferedReader(fr);
		System.out.println("File Contents");
		while((ch=br.readLine())!=null)
{
	System.out.println(ch);
}
	}
}
