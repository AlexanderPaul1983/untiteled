package GPD4Tasks;

public abstract class Tier {
     String name;

    public String getName() {
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public abstract void makeSound();
}
