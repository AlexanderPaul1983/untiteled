package GPDAufgaben;

public class Person {
    private String name;
    private String residence;
    private int age;

    // Constructer

    public Person(String name, String residence, int age){
        this.age = age;
        this.name = name;
        this.residence = residence;
        System.out.println("I was created by class Person ");

    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
