package Solution;

// Base class Person
public class Person
{
    private final String name;
    private final String address;
    private final String phoneNumber;
    private final String emailAddress;

    // Constructor for Person
    public Person(String name, String address, String phoneNumber, String emailAddress)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    // Override toString method to display person's information
    @Override
    public String toString()
    {
        return "Person: " + name;
    }
}
