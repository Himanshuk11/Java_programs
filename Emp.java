package Inheritance;

public class Emp {
  int id;
  String name;
  Double salary;
  
  public Emp(int id, String name, Double salary) {
    super();
    this.id = id;
    this.name = name;
    this.salary = salary;
  }
  @Override
  public String toString() {
    return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
  }
}