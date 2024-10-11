/*wap to accept the input from user  
and display the array in matrix form.*/ 
package Array; 
import java.util.*; 
public class TwoDarray
{ 
  public static void main(String[] args) { 
  int i,j; 
  int[][]a=new int[100][100]; 
  Scanner sc=new Scanner(System.in); 
  System.out.print("Enter rows."); 
  int r=sc.nextInt(); 
  System.out.print("Enter colms."); 
  int c=sc.nextInt(); 
   
  for(i=0;i<r;i++) 
  { 
   for(j=0;j<c;j++) 
   { 
     a[i][j]=sc.nextInt(); 
    
   } 
  } 
   
  for(i=0;i<r;i++) 
  { 
   for(j=0;j<c;j++) 
   { 
    System.out.print(a[i][j]+"\t"); 
    
   } 
   System.out.println(""); 
     
  } 
      
 } 
 
}