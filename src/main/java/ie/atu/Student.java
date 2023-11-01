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
}
