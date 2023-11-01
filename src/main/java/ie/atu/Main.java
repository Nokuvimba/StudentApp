package ie.atu;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //prompting the students

        //first student
        Student s1= new Student();
        s1.student1();
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