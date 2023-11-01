package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //constructors
        Student s1= new Student(); /*first student*/
        Student s2= new Student("student2Firstname "," student2Lastname");       /*second student*/
        Student s3= new Student("student3Firstname ","student3Lastname ","student3Email ","student3Course ");
        //prompting the students

        //first student
        s1.getStudentDetails();
         System.out.println(" ");
       //second student
         s2.student2();
        System.out.println(" ");
        //third student
         s3.student3();
        System.out.println(" ");

        //displaying the student details

        //first student
        System.out.println("First student details: ");
        s1.DetailsDisplay();
        //second student
        System.out.println("Second student details: ");
        s2.DetailsDisplay();
        //third student
        System.out.println("Third student details: ");
        s3.DetailsDisplay();

    }
}