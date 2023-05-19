package InclassAufgaben;


import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(325);
        list.add(548);
        list.add(369);
        list.add(5);

        for (Integer interger:list
             ) {
            System.out.println(interger);


        }
        System.out.println(list.size());
        Set<Integer> set = new LinkedHashSet<>();
        set.add(123);
        set.add(56);
        set.add(623);
        set.add(23);

        for (Integer newset:set
             ) {
            System.out.println(newset);

        }

        Map<String, Integer> map = new HashMap<>();
        map.put("asd", 123);
        map.put("as", 123);
        map.put("afg", 13);
        System.out.println(map.get("asd"));
        System.out.println(map.containsKey("akfg"));

        Collections.sort(list);
        System.out.println(list);


        List<Personen> personlist = new ArrayList<>();
        personlist.add(new Personen(6,"al","z"));
        personlist.add(new Personen(1,"gh","a"));


    }



}
