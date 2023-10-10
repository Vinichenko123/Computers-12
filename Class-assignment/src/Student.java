import java.sql.SQLOutput;
import java.util.ArrayList;

//Create a class called Student.  Students should have the following:
//First name
//Student ID  (use static variables)
//An array to hold Courses
//Static ID generator
//Create a class called Course.  Course should have the following:
//Subject Name
//Student grade
//When a Course object is printed the Subject name should print (to string)
//When a Student object is printed the Student ID and Name should print (to string)
//Course Constructor should take in a subject name and grade
//Student Constructor should take in a name and increase the student ID by 1
//Create a method to add a course to the students array
//Create a method to find the average grade in all of a student's courses
//Create a method that prints out the students courses


public class Student {

    String firstName;
    int student_ID;
    ArrayList<Course> CourseArrayList = new ArrayList<>();

public Student(String firstName, int student_ID){
    this.firstName = firstName;
    this.student_ID = student_ID;
}

public String getFirstName(){return firstName;}

public int getStudent_ID(){return student_ID;}

public void setStudent_ID(){this.student_ID = student_ID;}

public void setFirstName(){this.firstName = firstName;}






}