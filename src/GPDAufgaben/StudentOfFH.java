package GPDAufgaben;

import java.util.ArrayList;
import java.util.List;

public class StudentOfFH {
private String name;
private int id;
 List<Courses> coursename = new ArrayList<>();

//      Methods

    public void addCourse (Courses Courcename){
        coursename.add(Courcename);
        System.out.println("Der Student " + getName() + " wurde für den Kurs angemeldet " + Courcename);
    }


    public void removeCourse(Courses Course){
        if(coursename.contains(Course)){
            coursename.remove(Course);
            System.out.println("Der Kurs wurde gelöscht");
        }
        else {
            System.err.println("Dieser Kurs ist nicht in der Liste erhalten");
        }
    }
    public void getCourses(){
        System.out.println("Folgende Kurse sind belegt: ");
        for (Courses courses : coursename) {
            System.out.print(courses + " ");

        }

    }
    public void displayInfo(){
        System.out.println("Name is " + getName() + ", id nummer is " +getId() + ". Student besucht folgende Kurse " + coursename );
    }


    public StudentOfFH(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
