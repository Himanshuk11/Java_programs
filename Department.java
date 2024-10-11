package Inheritance;

public class Department{
  int dept_id;
  int dept_name;
  Emp emp;
  public Department(int dept_id, int dept_name, Emp emp) {
    super();
    this.dept_id = dept_id;
    this.dept_name = dept_name;
    this.emp = emp;
  }
  @Override
  public String toString() {
    return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + ", emp=" + emp + "]";
  }
  
}