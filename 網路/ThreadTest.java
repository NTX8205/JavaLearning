package 網路;


public class ThreadTest extends Thread {
    private String message;

    public ThreadTest(String msg) {
        this.message = msg;
    }

    public void run() {
        System.out.println("Thread message is:" + this.message);
    }

}
