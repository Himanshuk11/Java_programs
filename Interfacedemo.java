package Abstraction; 
 
public class Interfacedemo implements Myinterface1,Myinterface2  
{ 
 
 @Override 
 public void display() { 
  System.out.println("I am from MyInterface2"); 
   
 } 
 
 @Override 
 public void show() { 
  
  System.out.println("I am from MyInterface1");  
   
 } 
 
}