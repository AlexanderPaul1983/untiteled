package ObjectProgramming;

public class Listelement <T>{
    private T value;
    private Listelement<T> next;

    public Listelement(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Listelement<T> getNext() {
        return next;
    }

    public void setNext(Listelement<T> next) {
        this.next = next;
    }
}
