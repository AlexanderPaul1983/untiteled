package ObjectProgramming;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <String> list = new LinkedList<>();
        list.add(0,"Hallo");
        list.add(1,"die");
        list.add(2,"Welt");

        System.out.println(list.size());
    }
}
