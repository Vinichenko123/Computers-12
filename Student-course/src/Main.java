import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student suiiiiii = new School(47, 7, "Disaster", new ArrayList<Student>(), new ArrayList<Teacher>());
        Student Christiana = new Student("Chritiano", "Ronaldoo", 1, 1);
        Student Christianaa = new Student("B", "Ronaldooo", 2, 2);
        Student Christianaaa = new Student("C", "Ronaldoooo", 3, 3);
        Student Christianaaaa = new Student("D", "Ronaldooooo", 4, 4);
        Student Christianaaaaa = new Student("E", "Ronaldoooooo", 5, 5);
        Student Christianaaaaaa = new Student("F", "Ronaldooooooo", 6, 6);
        Student Christianaaaaaaa = new Student("G", "Ronaldoooooooo", 7, 7);
        Student Christianaaaaaaaa = new Student("H", "Ronaldooooooooo", 8, 8);
        Student Christianaaaaaaaaa = new Student("I", "Ronaldoooooooooo", 9, 9);
        Student Christianaaaaaaaaaa = new Student("J", "Ronaldooooooooooo", 10, 10);

        Courses Ronaldo = new Teacher("A", "a", "PHE");
        Courses Ronaldoo = new Teacher("B", "b", "PE");
        Courses Ronaldooo = new Teacher("C", "c", "HE");

        suiiiiii.addCourse(Christiana);
        suiiiiii.addCourse(Christianaa);
        suiiiiii.addCourse(Christianaaa);
        suiiiiii.addCourse(Christianaaaa);
        suiiiiii.addCourse(Christianaaaaa);
        suiiiiii.addCourse(Christianaaaaaa);
        suiiiiii.addCourse(Christianaaaaaaa);
        suiiiiii.addCourse(Christianaaaaaaaa);
        suiiiiii.addCourse(Christianaaaaaaaaa);
        suiiiiii.addCourse(Christianaaaaaaaaaa);

        suiiiiii.addCourse(Ronaldo);
        suiiiiii.addCourse(Ronaldoo);
        suiiiiii.addCourse(Ronaldooo);

        suiiiiii.showCourses();
        suiiiiii.showCourses();


    }


}