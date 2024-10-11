package Basicprograms;
import java.util.*;
public class Factors
{
public static void main(String[] args)
{


Scanner sc=new Scanner(System.in);
System.out.println("Enter value of n:"); 
int n=sc.nextInt();

System.out.println("Fators are as follows:");
for (int i=1;i<=n;i++)
{
if(n%i==0)
System.out.print(i+"\t");
}
}
}