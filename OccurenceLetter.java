package String; 
import java.util.*; 
public class OccurenceLetter { 
 
  public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter a string:"); 
    String str=sc.nextLine(); 
     
    int cnt[]=new int[300]; 
    int len=str.length(); 
     
    for(int i=0;i<len;i++) 
    { 
      cnt[(int)str.charAt(i)]++; 
       
    } 
    System.out.println("Occurance is as follow:"); 
    for(int i=0;i<cnt.length;i++) 
    { 
      if(cnt[i]!=0) 
        System.out.println((char)i+"="+cnt[i]); 
    } 
  } 
 
}