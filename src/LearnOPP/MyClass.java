package LearnOPP;

public class MyClass {
    public static void main(String[] args) {
  Bad bad = new Bad("Fuitsbad",2,2.5f,"Ohne Federn");
 Animal tier = new Animal("Mosja",2,3f);
 Animal mops = new Hund("Kasa",4,5,"Wachhund");
        System.out.println(Animal.getCounter());
 Animal bulle = new Bad("gugug",4,6,"keine");
        System.out.println(Animal.getCounter());

    }
}

