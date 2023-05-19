package LearnOPP;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            list.add(i,i);


        }
        System.out.println(list.get(4));
    }
}
