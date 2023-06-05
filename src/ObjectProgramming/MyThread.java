package ObjectProgramming;

public class MyThread extends Thread {
    private int id;

    private MyThread(int id){
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("ich bin Tread num: "+id);
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("ich bin Thread num: "+ id);
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread tread1 = new MyThread(1);
        MyThread tread2 = new MyThread(2);
        tread1.start();
        tread2.start();
        tread1.join();
        tread2.join();
        System.out.println("ich bin eine Ausgabe");
    }
}
