package String; 
 
public class Wrapperdemo { 
 
 public static void main(String[] args) { 
  //autoboxing 
  int x=10; 
  Integer i1=new Integer(x); 
  System.out.println("Value of x="+i1); 
   
  double d=23.89; 
  Double d1=new Double(d); 
  System.out.println("Value od d="+d1); 
   
  Float f1=Float.valueOf(9.6f); 
  System.out.println("Value of f="+f1); 
   
   
  //unboxing 
  Integer i2=x; 
  System.out.println(i2); 
  int a1=i1.intValue(); 
  System.out.println("Value of a1="+a1); 
   
  /*int a1=i1.intValue(); 
  System.out.println("Value of a1="+a1); 
  */ 
   
  Double y1=d1.doubleValue(); 
  System.out.println("Value of y1="+y1); 
   
  //Converting string to wrapper class 
   
  Integer i3=new Integer("25"); 
  System.out.println("Value of i3="+(i3+i3)); 
   
  //String into primitive type 
   
  int r=Integer.parseInt("20"); 
  System.out.println("Sum="+(r+r)); 
 } 
 
}