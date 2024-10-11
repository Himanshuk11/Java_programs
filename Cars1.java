package OOPS;
class Car1 

{
  
    String model;
    int year;
    double price;
    
    public Car1(String model, int year, double price) 
    {
        this.model = model;
        this.year = year;
        this.price = price;
    }
    
  
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println(); 
    }
}