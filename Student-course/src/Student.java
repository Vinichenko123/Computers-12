import java.util.ArrayList;
public class Student {

    private String firstName;
    private static int identificaion = 0;
    private int studentId;

    private ArrayList<Course> courselist = new ArrayList<>();

    Student(String firstName) {
        this.firstName = firstName;
        this.studentId = identificaion;
        this.courselist = courselist;
        identificaion++;
    }

    public String toString(){
        return "Name: " + this.firstName + "| Student ID: " + this.studentId;
    }

    public void addCourse(String subject, int grade) {
        courselist.add(new Course(subject, grade));
    }

    public String showCourses(){
        return courselist.toString();
    }

    public int averageGrade(){
        int total = 0;
        for(int i = 0; i < courselist.size(); i++){
            total += courselist.get(i).getGrade();
        }
        return (total/(courselist.size()));
    }

    public ArrayList getCourses(){
        return courselist;
    }

    public String getFirstName(){
        return firstName;
    }

    public int getID(){
        return studentId;
    }

    public void setFirstName(String name){
        this.firstName = name;
    }



}
