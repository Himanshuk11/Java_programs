package OOPS;
public class Product
{
 private String productName;
 private double price;
 private int quantity;
 
 public Product(String productName, double price, int quantity) 
 {
     this.productName = productName;
     this.price = price;
     this.quantity = quantity;
 }
 
 public void displayProductDetails() 
 {
     System.out.println("Product Name: " + productName);
     System.out.println("Price: " + price);
     System.out.println("Quantity: " + quantity);
     System.out.println(); 
 }
}
