package GPDAufgaben;

public class Main {
    public static void main(String[] args) {
        Courses englisch = new Courses("Englisch");
        Courses deutsch = new Courses("Deutsch");

    StudentOfFH student = new StudentOfFH("Max",46561);

        student.addCourse(englisch);
        student.addCourse(deutsch);
        student.getCourses();











    }
}
