package Solution;

// Subclass Faculty extending Employee
public class Faculty extends Employee
{
    private final String officeHours;
    private final String rank;

    // Constructor for Faculty
    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String officeHours, String rank)
    {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    // Override toString method
    @Override
    public String toString()
    {
        return "Faculty: " + super.toString() + ", Office Hours: " + officeHours + ", Rank: " + rank;
    }
}

