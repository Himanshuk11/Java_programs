package Exception;
import java.util.*;
class Arithmatic{
  
  Scanner sc=new Scanner(System.in);
  void accept() {
    System.out.println("Enter two numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    
    try
    {
      System.out.println("Sum=" +(a+b));
      System.out.println("Sub=" +(a-b));
      System.out.println("Product=" +(a*b));
      System.out.println("Divide="+(a/b));
      
    }
    catch(Exception ex){
      System.out.println(ex.getMessage());

    }
   
  }
  
  

}
public class Demo {

  public static void main(String[] args) {
    
    Arithmatic a=new Arithmatic();
    a.accept();  

  }

}