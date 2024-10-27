package Solution;

// Subclass Student extending Person
public class Student extends Person
{
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private final String classStatus;

    // Constructor for Student
    public Student(String name, String address, String phoneNumber, String emailAddress, String classStatus)
    {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
    }

    // Override toString method
    @Override
    public String toString()
    {
        return "Student: " + super.toString() + ", Class Status: " + classStatus;
    }
}
