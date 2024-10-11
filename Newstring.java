package OOPS;
import java.util.*;  
public class Newstring 
{  
public static void main(String args[])   
{  
String str;  
int i, len;  
int counter[] = new int[256];  
Scanner sc=new Scanner(System.in); 
System.out.print(" Enter a string: ");  
str= scanner.nextLine();  
len= str.length();  
for (i=0; i<len; i++)   
{  
counter[(int) str.charAt(i)]++;  
}  
for (i=0; i<256; i++)   
{  
if (counter[i] != 0)   
{  
System.out.println((char) i + " = " + counter[i]);  
}
}
}
}
 
  

// java program to check wheather given string is a panlindorme or not without using 

//to find the reverse of the string without using built in function reverse