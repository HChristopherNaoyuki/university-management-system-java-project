package Solution;

// Test program to demonstrate the functionality of the classes
public class TestProgram
{
    public static void main(String[] args)
    {
        // Create MyDate object for date hired
        MyDate dateHired = new MyDate(15, 8, 2020);

        // Create instances of each class
        Person person = new Person("John Doe", "123 Elm St", "555-1234", "john@example.com");
        Student student = new Student("Jane Smith", "456 Oak St", "555-5678", "jane@example.com", Student.FRESHMAN);
        Employee employee = new Employee("Mark Taylor", "789 Pine St", "555-9101", "mark@example.com", "Room 101", 60000, dateHired);
        Faculty faculty = new Faculty("Dr. Alice Johnson", "321 Maple St", "555-1111", "alice@example.com", "Room 202", 75000, dateHired, "Mon-Fri 9-11", "Professor");
        Staff staff = new Staff("Bob Brown", "654 Cedar St", "555-2222", "bob@example.com", "Room 303", 50000, dateHired, "Administrative Assistant");

        // Print the details of each object
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
