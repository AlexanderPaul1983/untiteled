package ObjectProgramming;

public class MyGenericsClass <T>{
    private T something;

    public static <T> int name (T generik){
        return (int) generik;
    }

    public T getSomething() {
        return something;
    }
    public  void setSomething(T something){
        this.something=something;
    }
public MyGenericsClass (T something){
        this.something=something;
}
}
