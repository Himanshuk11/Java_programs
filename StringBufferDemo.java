package String;
import java.util.*;
public class StringBufferDemo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
        String str=sc.nextLine();
        StringBuffer sb=new StringBuffer(str);
        System.out.println("Original string="+sb);
        System.out.println("Reverse="+sb.reverse());
        System.out.println(sb);
        System.out.println("Enter the position and data you want to insert: ");
        int pos=sc.nextInt();
        String st=sc.nextLine();
        System.out.println("Inserted String="+sb.insert(pos,st));
        System.out.println("Enter the start and end position to delete: ");
        int strt=sc.nextInt();
        int end=sc.nextInt();
        sb.delete(strt, end);
        System.out.println("Deleted String="+sb);
        System.out.println(str);
        
	}
}