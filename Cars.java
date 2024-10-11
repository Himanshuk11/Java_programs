package OOPS;

public class Cars {
  int modelno;
  String name,color;
  double price;
  
  Cars()
  {
    
    modelno=101;
    name="Suzuki Dezire";
    color="Silver";
    price=850000;
    
  }
  Cars(int modno,String nm,String c,double r)
  {
    System.out.println("Invoke default constructor.");
    modelno=modno;
    name=nm;
    color=c;
    price=r;
  }
  Cars(int modelno,String color,double price,String name)
  {
    System.out.println("Invoke default constructor.");
    this.modelno=modelno;
    this.name=name;
    this.color=color;
    this.price=price;
  }
  void display()
  {
    System.out.println("Car Details area as follow:");
    System.out.println("Modelno="+modelno+"\tName="+name+"\tColor="+color+"\tPrice="+price);
  }
}




//write a java program to design a class manager with data members manager id, manager name, salary, project name,
//accpet the input ftom user and display the detail using the concept of constructer 