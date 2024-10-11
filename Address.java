package OOPS;
public class Address 
{
     String city;
     String state;
     String zipCode;
    
    public Address(String city, String state, String zipCode) {
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    
    public void displayAddress() {
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip Code: " + zipCode);
    }
}
