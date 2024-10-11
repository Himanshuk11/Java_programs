package OOPS;

public class Carsmain {

  public static void main(String[] args) {
    Cars c=new Cars();
    c.display();
    
    Cars c1=new Cars(102,"BMW","Black",950000);
    c1.display();
    
    Cars c2=new Cars(103,"Black",750000,"Waganor");
    c2.display();
  }
}