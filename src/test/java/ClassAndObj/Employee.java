package ClassAndObj;

public class Employee {
    //Class variable :- will be common for all the objects but their values will be different
    //class Properties
    String name;
    int age;
    double salary;
    boolean active;
    public static void main(String[] args) {
        //create the object : use new keyword
        Employee employee = new Employee();

        employee.name= "Sonu Kumar";
        employee.age= 36;
        employee.salary = 0.00;
        employee.active = true;
        System.out.println("Employee Name : "+ employee.name + " Emp_Age " +  employee.age+ "Emp_salary "+ employee.salary +"employee is active : "+ employee.active);
        System.out.println("Code change for 6 PP");
    }
}
