package ie.atu;

import java.util.Scanner;
public class Student {
    private String Name;
    private String Email;
    private String Course;

    public Student()
    {
        this.Name = "";
        this.Email = "";
        this.Course = "";
    }
public void setName(String Name)
{
    this.Name = Name;
}

public String getName()
{
    return Name;
}

public void setEmail(String Email)
{
    this.Email = Email;
}

public String getEmail()
{
    return Email;
}

public void setCourse(String Course)
{
    this.Course = Course;
}

public String getCourse()
{
    return Course;
}

public void Student2()
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter student name: ");
    this.Name = scanner.nextLine();
}

public void Student3()
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter student name: ");
    this.Name = scanner.nextLine();
    System.out.println("Please enter student email: ");
    this.Email = scanner.nextLine();
    System.out.println("Please enter student course: ");
    this.Course = scanner.nextLine();
}
public void display(int num)
{
    System.out.println("Name of student " + num + ": " + getName());
    System.out.println("Email of student " + num + ": " + getEmail());
    System.out.println("Course of student " + num + ": " + getCourse() + "\n\n");
}

}
