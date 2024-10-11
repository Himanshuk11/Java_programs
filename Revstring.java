package String;
public class Revstring 
{

public static void main(String args[]) 
{

String before="Hello Himanshu";
String after=reverse(before);
System.out.println(after);

}
public static String reverse(String str)
{
String reversed="";

for(int i=str.length()-1; i>=0; i--)
{
reversed+=str.substring(i,i+1);

}
return reversed;

}

}