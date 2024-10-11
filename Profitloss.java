package Basicprograms; 
import java.util.*; 
public class Profitloss 
{ 
 public static void main(String[]args) 
 { 
  Scanner sc =new Scanner(System.in); 
  System.out.println("Enter seling price or cost price:"); 
  int sp=sc.nextInt(); 
  int cp=sc.nextInt(); 
   
  if(sp>cp) 
   System.out.println("Profit"); 
  else 
   System.out.println("Loss"); 
 } 
}