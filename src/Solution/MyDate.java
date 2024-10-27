package Solution;

// MyDate class to represent a date
public class MyDate
{
    private final int day;
    private final int month;
    private final int year;

    // Constructor for MyDate
    public MyDate(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Override toString method to display date in a readable format
    @Override
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
}
