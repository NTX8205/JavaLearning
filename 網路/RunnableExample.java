package 網路;

public class RunnableExample implements Runnable {
    private String name;
    static int sum;

    public RunnableExample(String str) {
        name = str;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10000000; j++); // dummy loop
            System.out.println(name + " is running..");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RunnableExample r1 = new RunnableExample("apple");
        RunnableExample r2 = new RunnableExample("banana");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        // t1.sleep(1000);
        t2.start();
        // t2.sleep(1000);
    }
}
