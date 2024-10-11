package OOPS;
public class PersonEmp
 
 protected String name;
 protected int age;
 
 public PersonEmp(String name, int age) 
 {
     this.name = name;
     this.age = age;
 }
 
 public void displayPersonDetails() 
 {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}
