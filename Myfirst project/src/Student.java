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




import java.util.ArrayList;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private static int identification = 0;
    private int studentID;
    private ArrayList<Course> courselist = new ArrayList<>();

    Student(String firstName) {
        this.firstName = firstName;
        this.studentID = identification;
        this.courselist = courselist;
        identification++;
    }

    public String toString() {
        return "Name: " + this.firstName + ", Student ID: " + this.studentID;
    }

    public void addCourse(String subject, int grade) {
        courselist.add(new Course(subject, grade));
    }

    public String showCourse() {
        return courselist.toString();
    }

    public int averageGrade() {
        int total = 0;
        for (int i = 0; i < courselist.size(); i++) {
            total += courselist.get(i).getGrade();
        }
        return (total / (courselist.size()));
    }

    public ArrayList getCourses() {
        return courselist;
    }

    public String getFirstName() {
        return  firstName;
    }

    public int getID() {
        return studentID;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }



}



/*
    public void addStudent(Student i){
        studentArrayList.add(i);
    }
    public void deleteStudent(Student i){
        studentArrayList.remove(i);
    }
    public void addTeacher(Teacher i){
        teacherArrayList.add(i);
    }

    public void showStudents(){
        for(int i = 0; i < studentArrayList.size(); i++){
            System.out.println("Name:" + studentArrayList.get(i).name() + "Grade:" + studentArrayList.get(i).grade);
        }
    }
    public void showTeachers(){
        for(int i = 0; i < teacherArrayList.size(); i++){
            System.out.println("Name:" + teacherArrayList.get(i).name() + " Subject:" + teacherArrayList.get(i).subject);
        }
    }

 */


