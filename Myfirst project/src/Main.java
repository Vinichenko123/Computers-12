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


