/*wap to accept the input from user  
and display the array in matrix form.*/ 
package Array; 
import java.util.*; 
public class sumofarray 
{ 
 
 public static void main(String[] args) { 
  int i,j,sum=0; 
  int a[][]=new int[100][100]; 
  Scanner sc=new Scanner(System.in); 
  System.out.print("Enter rows."); 
  int r=sc.nextInt(); 
  System.out.print("Enter cols."); 
  int c=sc.nextInt(); 
  System.out.println("Enter elements"); 
 
  for(i=0;i<r;i++) 
  { 
   for(j=0;j<c;j++) 
   { 
     a[i][j]=sc.nextInt();  
     sum=sum+a[i][j]; 
   } 
  } 
  System.out.println("Matrix is as follow:"); 
  for(i=0;i<r;i++) 
  { 
   for(j=0;j<c;j++) 
   { 
    System.out.print(a[i][j]+"\t");    
   } 
   System.out.println(""); 
     }   
  System.out.println("Sum  of all array elements= "+sum); 
 } 
} 