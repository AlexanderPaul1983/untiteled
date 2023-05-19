package ObjectProgramming;

public class LinkedLinks <T>{
    private Listelement<T> root;
    public void add(T value){
        if(root == null){
            Listelement<T> newElement = new Listelement<>(value);
            root = newElement;
        } else {
            Listelement<T>newElement = new Listelement<>(value);
            Listelement<T> currentElement = new Listelement<>(value);
            while (currentElement.getNext() != null){
                currentElement=currentElement.getNext();
            }
            currentElement.setNext(newElement);
        }


    }

    public static void main(String[] args) {
        LinkedLinks<String> list =new LinkedLinks<>();
        list.add("Hallo");
        list.add("Welt");

    }
}
