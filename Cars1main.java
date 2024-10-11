package OOPS;
public class Cars1main {
    public static void main(String[] args) {
        Car1 car1 = new Car1("Toyota Fortuner", 2022, 4000000);
        Car1 car2 = new Car1("Honda City", 2023, 1200000);
        
        System.out.println("Car1 1 Details:");
        car1.displayDetails();
        
        System.out.println("Car1 2 Details:");
        car2.displayDetails();
    }
}