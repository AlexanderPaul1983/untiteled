package ObjectProgramming;

public class SimpleClass {
    // Eigenschaften
   private int age;
    private String firstname;
   private String lastname;
   int counter;
   // Constructors
    public SimpleClass (int age, String firstname){
        this.age = age;
        this.firstname = firstname;
        if(age>=18){
            counter++;
            System.out.println("Sie sind zugelassen." + "Sie sind der: " + counter + " Kunde!");

        }else System.out.println("Leider, wurden sie nicht zugelassen");

    }

    public int getAge() {
        return age;
    }

    public int getCounter() {
        return counter;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public SimpleClass (String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    System.out.println("Ich wurde erstellt");

}
public SimpleClass (int age, String firstname, String lastname){
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
    }

}

