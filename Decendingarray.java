
package Array; 
import java.util.*; 
public class Decendingarray{ 
 
 public static void main(String[] args) { 
  int[]a=new int[100]; 
  int temp; 
     Scanner sc=new Scanner(System.in); 
     System.out.println("Enter array size:"); 
     int n=sc.nextInt(); 
     System.out.println("Enter array elements:"); 
     for(int i=0;i<n;i++) 
     { 
       a[i]=sc.nextInt(); 
     } 
     System.out.println("Array elements are as follow:"); 
     for(int i=0;i<n;i++) 
     { 
       System.out.println(a[i]); 
     } 
     System.out.println("Array in Descending order."); 
     for(int i=0;i<n;i++) 
     { 
      for(int j=i+1;j<n;j++) 
      { 
       if(a[i]<a[j]) 
       { 
        temp=a[i]; 
        a[i]=a[j]; 
        a[j]=temp; 
       } 
      } 
        System.out.println(a[i]); 
 
     } 
 } 
 
}