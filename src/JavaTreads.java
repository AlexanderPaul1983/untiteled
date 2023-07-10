import ObjectProgramming.MyThread;

public class JavaTreads  extends Thread{

    private int nameOfTread;
    public JavaTreads(int nameOfTread){
        this.nameOfTread = nameOfTread;
    }

    @Override
    public void run() {
        for (int i = 4; i >=0; i--) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("ich bin ein tread" + nameOfTread);
    }

    public static void main(String[] args) throws InterruptedException {
        JavaTreads tr = new JavaTreads(1);
        JavaTreads tr2 = new JavaTreads(2);
        tr.start();
        tr2.start();

    }
}
