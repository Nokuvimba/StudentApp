package ie.atu;

import java.util.Scanner;
public class Student {
    String firstName;
    String lastName;
    String email;
    String course;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Student(String firstName, String lastName, String email, String course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.course = course;
    }

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void getStudentDetails(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("Enter your email: ");
        this.email= scanner.nextLine();

        System.out.print("Enter your course: ");
        this.email= scanner.nextLine();
    }

}
