package ObjectProgramming;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List <Hund> list = new LinkedList<>();
        System.out.println("Unser Heim hat viele Hunde");
        TreadsMaker.lassInHintergrundLaufen(() -> {
            for (int i = 0; i < 100; i++) {
                Hund hund = new Hund("Barsik " +i);
                list.add(hund);

            }
        });
        System.out.println("Das sind unsere Hunde");
        for (Hund hund : list) {
            System.out.println(hund.getName());
        }

    }
}
