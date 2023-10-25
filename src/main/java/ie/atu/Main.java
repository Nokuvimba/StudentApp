package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //first student details
        Student s1= new Student();
        s1.getStudentDetails();
        System.out.println("\nFirst student details: "+ " \n");
        System.out.println("Name:" + " " + s1.getFirstName() + " " + s1.getLastName() );
        System.out.println("Student email: " + s1.getEmail() );
        System.out.println("Student course: " + s1.getCourse());


    }
}