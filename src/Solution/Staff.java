package Solution;

// Subclass Staff extending Employee
public class Staff extends Employee
{
    private final String title;

    // Constructor for Staff
    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String title)
    {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    // Override toString method
    @Override
    public String toString()
    {
        return "Staff: " + super.toString() + ", Title: " + title;
    }
}
