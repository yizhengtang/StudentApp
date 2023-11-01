package ie.atu;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student App\n");
        System.out.println("Student 1\n");
        System.out.println("Please enter student name: ");
        s1.setName(scanner.nextLine());
        System.out.println("Please enter student email: ");
        s1.setEmail(scanner.nextLine());
        System.out.println("Please enter student course: ");
        s1.setCourse(scanner.nextLine());

        System.out.println("\n\nStudent 2\n");
        s2.Student2();
        System.out.println("Please enter student email: ");
        s2.setEmail(scanner.nextLine());
        System.out.println("Please enter student course: ");
        s2.setCourse(scanner.nextLine());

        System.out.println("\n\nStudent 3\n");
        s3.Student3();

        s1.display(1);
        s2.display(2);
        s3.display(3);

    }
}