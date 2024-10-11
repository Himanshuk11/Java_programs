package OOPS;
public class Productmain
{
    public static void main(String[] args) {
        Product[] products = new Product[3];
        
        products[0] = new Product("Laptop", 56000, 5);
        products[1] = new Product("Smartphone",72000, 10);
        products[2] = new Product("Ipad", 32000, 7);
        
        for (Product product : products) {
            product.displayProductDetails();
        }
    }
}
