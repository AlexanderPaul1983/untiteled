package ObjectProgramming;

public class TreadsMaker {
    public static void lassInHintergrundLaufen(Runnable runnable){
        Thread thread = new Thread(runnable);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
