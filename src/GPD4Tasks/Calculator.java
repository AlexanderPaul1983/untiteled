package GPD4Tasks;

public class Calculator {
    public void divideCalculator(double a, double b) {
        try {
            double sum = a/b;
            System.out.println(sum);
        } catch (ArithmeticException exception) {
            System.out.println("die zweite Zahl darf nie 0 sein");

        }
    }
}

