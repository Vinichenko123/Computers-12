import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        Student nima = new Student ("Nima");
        Student richard = new Student("Richard");
        Student nick = new Student("Wodan");
        nick.addCourse("Soccer", 50);
        nick.addCourse("ultimate",100);
        nima.addCourse("Math", 92);
        nima.addCourse("Focusing in Computers", -1);
        richard.addCourse("Physics", 99);
        richard.addCourse("try not to sleep in physics challenge",18);
        System.out.println("Nima's courses: "+nima.showCourse());

        System.out.println(nima + nima.showCourse());
        System.out.println(richard + richard.showCourse());
        System.out.println(nick + nick.showCourse());


        System.out.println("The average grade of " + richard.getFirstName() +" is "+ richard.averageGrade());

        System.out.println("The average grade of " + nima.getFirstName() +" is "+ nima.averageGrade());

        System.out.println("The average grade of " + nick.getFirstName() +" is "+ nick.averageGrade());


    }

}



/*

public class Main {
    public static void main(String[] args) {
        Student cool = new Student ("q4");
        cool.addCourse("silly course", 100);
        cool.addCourse("sillier course", 1560);
        cool.addCourse("silly c123ourse", 10230);
        cool.addCourse("sillier cou123rse", 110);
        System.out.println(cool.showCourse());
        System.out.println("the average grade of this student is: " + cool.averageGrade());
        System.out.println(cool);
        System.out.println(cool.getCourses().get(0));
        Student notcool = new Student("What's my id? is it 1 higher than wow?" );
        System.out.println(notcool);
    }
}

 */