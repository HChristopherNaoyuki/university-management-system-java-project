# University Management System

## Overview

The **University Management System** is a Java application that models the personnel structure of a university. It incorporates object-oriented programming principles such as inheritance and encapsulation. The system includes classes for different roles within a university: Person, Student, Employee, Faculty, and Staff.

## Features

- **Person Class**: Base class containing common attributes for all persons.
- **Student Class**: Inherits from Person and includes class status (Freshman, Sophomore, Junior, Senior).
- **Employee Class**: Inherits from Person, adding office location, salary, and date hired.
- **Faculty Class**: Inherits from Employee, with additional attributes for office hours and rank.
- **Staff Class**: Inherits from Employee, including a title attribute.
- **MyDate Class**: Utility class to manage date objects.

## UML Diagram

```
+--------------------------+
|     Person               |
+--------------------------+
| - name: String           |
| - address: String        |
| - phoneNumber: String    |
| - emailAddress: String   |
+--------------------------+
| + toString(): String     |
+--------------------------+
        |
        |
        +--------------------------------+
        |                                |
+--------------------------+     +-----------------------+
|       Student            |     |       Employee        |
+--------------------------+     +-----------------------+
| - classStatus: String    |     | - office: String      |
+--------------------------+     | - salary: double      |
| + toString(): String     |     | - dateHired: MyDate   |
+--------------------------+     +-----------------------+
                                 | + toString(): String  |
                                 +-----------------------+
                                        |
         +------------------------------+
         |                              |
+-----------------------+    +-----------------------+ 
|        Faculty        |    |         Staff         |
+-----------------------+    +-----------------------+ 
| - officeHours: String |    | - title: String       |
| - rank: String        |    +-----------------------+ 
+-----------------------+    | + toString(): String  |
| + toString(): String  |    +-----------------------+ 
+-----------------------+       
```

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/university-management-system.git
   ```
2. Navigate to the project directory:
   ```bash
   cd university-management-system
   ```
3. Compile the Java files:
   ```bash
   javac *.java
   ```
4. Run the test program:
   ```bash
   java TestProgram
   ```

## Usage

The test program creates instances of each class and demonstrates their functionality. It prints details about each person, student, employee, faculty member, and staff member to the console.

## License

This project is licensed under the MIT License. See the LICENSE file for details.
