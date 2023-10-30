package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        //first student details
        Student s1= new Student();
        s1.getStudentDetails();
         System.out.println(" ");

       //second student
       Student s2= new Student(" "," ");
         s2.student2();
        System.out.println(" ");

        //third student
        Student s3= new Student(" "," "," "," ");
         s3.student3();
        System.out.println(" ");
        //displaying the student details
         s1.display1();
         s2.display2();
         s3.display3();
    }
}