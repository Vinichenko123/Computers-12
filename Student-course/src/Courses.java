public class Courses {

    private String subject;
    private int grade;

    Courses(String subject, int grade){
        this.grade = grade;
        this.subject = subject;
    }

    public String toString(){
        return "Course Name: " + this.subject;
    }

    public int getSubject() {
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

}
