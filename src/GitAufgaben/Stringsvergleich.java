package GitAufgaben;

import ObjectProgramming.SimpleClass;

public class Stringsvergleich {
    public static String getLongestString(String... strings) {
        String longestString = strings[0];

        for (String string : strings) {
            if (string.length() > longestString.length()) {
                longestString = string;
            }
        }

        return longestString;
    }

    public static void main(String[] args) {
        System.out.println(getLongestString("you", "eat", "sometimes", "the", "bear"));
        System.out.println(getLongestString("java", "ist", "toll"));

    }
}


