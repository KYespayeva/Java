package OOP;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return firstName + " " + lastName;
    }
    public void setSalary(int newSalary){
        this.salary = newSalary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        this.salary =(salary/100 * percent + salary);
        return salary;
    }
    @Override
    public String toString(){
        return "Employee[id= " + id + ", name= " + getName() + ", salary= " + salary + " ]";

    }

}
