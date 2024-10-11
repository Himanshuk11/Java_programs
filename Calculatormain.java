package OOPS;
public class Calculatormain
{
    public static void main(String[] args) 
    {
   
        Calculator calc = new Calculator();
   
        int sum1 = calc.add(5, 10);
        System.out.println("Sum of 5 and 10: " + sum1);
       
        int sum2 = calc.add(4, 7, 9);
        System.out.println("Sum of 4, 7, and 9: " + sum2);
    }
}