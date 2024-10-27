package Solution;

// Base class Employee extending Person
public class Employee extends Person
{
    private String office;
    private double salary;
    private MyDate dateHired;

    // Constructor for Employee
    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired)
    {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    // Override toString method
    @Override
    public String toString()
    {
        return "Employee: " + super.toString() + ", Office: " + office + ", Salary: " + salary + ", Date Hired: " + dateHired;
    }
}
