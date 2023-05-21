package InclassAufgaben;

public class BiggestDigit {
    public static void main(String[] args) {
        int[] digits = {1,2,5,12,6,2,3,10,-22};
        int actuellybiggestDigit = 0;

        for (int digit : digits) {
            if (digit > actuellybiggestDigit) {
                actuellybiggestDigit = digit;
            }
        }
        System.out.println(actuellybiggestDigit);

    }
}
