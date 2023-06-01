package GPDAufgaben;

public class Student extends Person{
    private String Study_Subject;

    public Student(String name, String residence, int age) {
        super(name, residence, age);
    }

    public String getStudy_Subject() {
        return Study_Subject;
    }

    public void setStudy_Subject(String study_Subject) {
        Study_Subject = study_Subject;
    }

    public Student(String name, String residence, int age, String study_Subject) {
        super(name, residence, age);
        Study_Subject = study_Subject;
    }
}
