package 介面.unit7;

public class hw3 {
    public static class MultiThread1 extends Thread {
        String name;

        MultiThread1(String name1) {
            name = name1;
        }

        public void run() {
            for (int j = 0; j < 100; j++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println("thread 1");
            }
        }
    }

    public static class MultiThread2 extends Thread {
        String name;

        MultiThread2(String name1) {
            name = name1;
        }

        public void run() {
            for (int j = 0; j < 100; j++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println("thread 2");
            }
        }
    }

    public static void main(String args[]) {
        MultiThread1 t1 = new MultiThread1("thread 1");
        MultiThread2 t2 = new MultiThread2("thread 2");
        t1.start();
        t2.start();
    }
}