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
        this.lastName= " ";
        this.firstName=" ";
        this.email=" ";
        this.course=" ";
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
        this.course= scanner.nextLine();
    }
    public void display1(){
        System.out.println("First student details: ");
        System.out.println("Student  name:" + " " + getFirstName() + " " + getLastName() );
        System.out.println("Student email: " + getEmail() );
        System.out.println("Student course: " + getCourse() + "\n");
    }
//second student
    public void student2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name:");
        firstName=scanner.nextLine();
        System.out.println("Enter your last name:");
        lastName = scanner.nextLine();
        System.out.println("Enter your email:");
        setEmail(scanner.nextLine());
        System.out.println("Enter your course:");
        setCourse(scanner.nextLine());



    }
    public void display2(){
        System.out.println("Second student details: ");
        System.out.println("Student name "+ firstName+" "+ lastName);
        System.out.println("Student email " + getEmail());
        System.out.println("Student course " + getCourse()+"\n");
    }

//third student
public void student3(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your first name:");
    firstName=scanner.nextLine();
    System.out.println("Enter your last name:");
    lastName = scanner.nextLine();
    System.out.println("Enter your email:");
    email=scanner.nextLine();
    System.out.println("Enter your course:");
    course=scanner.nextLine();


}
public void display3(){
    System.out.println("Third student details: ");
    System.out.println("Student name "+ firstName+" "+ lastName);
    System.out.println("Student email " + email);
    System.out.println("Student course " + course+"\n");
}

}
