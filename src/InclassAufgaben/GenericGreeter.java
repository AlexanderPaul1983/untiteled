package InclassAufgaben;

public class GenericGreeter {
    public <T extends Greeter> void greet(T greeter){
        System.out.println(greeter.sayHello());
    }
}
