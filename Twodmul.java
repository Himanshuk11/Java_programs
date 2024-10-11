package Array;
 
import java.util.*; 
 
public class Twodmul
{ 
 
 public static void main(String[] args) { 
  Scanner sc=new Scanner(System.in); 
  int i,j,k; 
  System.out.println("Enter rows:"); 
  int r=sc.nextInt(); 
  System.out.println("Enter cols:"); 
  int c=sc.nextInt(); 
  int a[][]=new int[r][c]; 
  int b[][]=new int[r][c]; 
  int c1[][]=new int[r][c]; 
 System.out.println("Enter the first array elements:"); 
 for(i=0;i<r;i++) 
 { 
  for(j=0;j<c;j++) 
  { 
    a[i][j]=sc.nextInt();    
  }  
 } 
 System.out.println("Enter the second array elements:"); 
 for(i=0;i<r;i++) 
 { 
  for(j=0;j<c;j++) 
  { 
    b[i][j]=sc.nextInt();    
  }  
 } 
 System.out.println("1st Matrix is as follow:"); 
 for(i=0;i<r;i++) 
 { 
  for(j=0;j<c;j++) 
  { 
   System.out.print(a[i][j]+"\t");    
  } 
  System.out.println(""); 
    }   
 System.out.println("2nd Matrix is as follow:"); 
 for(i=0;i<r;i++) 
 { 
  for(j=0;j<c;j++) 
  { 
   System.out.print(b[i][j]+"\t");    
  } 
  System.out.println(""); 
    }   
 System.out.println("Multiplication of matrix:"); 
 for(i=0;i<r;i++) 
 { 
  for(j=0;j<c;j++) 
  { 
   c1[i][j]=0; 
   for(k=0;k<c;k++) 
   { 
    c1[i][j]=c1[i][j]+a[i][k]*b[k][j]; 
   } 
 
 } 
   
  for(i=0;i<r;i++) 
  { 
   for(j=0;j<c;j++) 
   { 
    System.out.print(c1[i][j]+"\t");    
   } 
   System.out.println(""); 
     }   
 } 
 } 
 
}