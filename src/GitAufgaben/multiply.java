package GitAufgaben;

public class multiply {
    public static int recursivMultiply(int firstdigit, int seconddigit){
      if (seconddigit==0){
          return 0;
      }else return firstdigit+recursivMultiply(firstdigit,seconddigit-1);
    }

    public static void main(String[] args) {
        System.out.println(recursivMultiply(5,4));

    }
}
