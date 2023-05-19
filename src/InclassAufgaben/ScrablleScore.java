package InclassAufgaben;

import java.util.Scanner;

public class ScrablleScore {
    public static void main(String[] args) {
        int sum = 0;
        // hier erfolg die Eingabe des Wordes von Nutzer
        System.out.println("Geben Sie bitte das Scrabble Word ein: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        // hier werden die Buchstaben im  eingegebenen Word zu Großbuchstabem umgewandelt
        String wordTouppercase = word.toUpperCase();
        // jetzt werden einzelnen Buchstaben getrennt
        char[] letters = wordTouppercase.toCharArray();
        // jetzt werden alle Buchstaben ausgewertet und gezählt
        for (char letter:letters) {
            switch (letter) {
                case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> sum++;
                case 'D', 'G' -> sum += 2;
                case 'B', 'C', 'M', 'P' -> sum += 3;
                case 'F', 'H', 'V', 'W', 'Y' -> sum += 4;
                case 'K' -> sum += 5;
                case 'J', 'X' -> sum += 8;
                case 'Q', 'Z' -> sum += 10;
            }

        }
        System.out.println("Das Scrabble Score Ihres Wordes beträgt: "+ sum+ " Punkte!");



    }
}
