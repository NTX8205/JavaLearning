package 介面.unit7;

//共享記憶體的問題(資料不一致的問題) , 有synchronized 可以解決
public class hw4 {
    public static int k = 0;

    // synchronized public static void print_k(){
    public static void print_k() {
        k = k + 1;
        System.out.println("-" + k + "-");
        if (k == 200)
            System.exit(0);
    }

    public static class MultiThread1 extends Thread {
        MultiThread1(String name) {
            super(name);
        }

        public void run() {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                }
                System.out.print("thread 1:");
                print_k();
            }
        }
    }

    public static class MultiThread2 extends Thread {
        MultiThread2(String name) {
            super(name);
        }

        public void run() {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                }
                System.out.print("thread 1:");
                print_k();
            }
        }
    }

    public static void main(String args[]) {
        MultiThread1 t1 = new MultiThread1("thread 1");
        MultiThread2 t2 = new MultiThread2("thread 2");
        Thread thread = Thread.currentThread();
        t1.start();
        t2.start();
        while (true) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
            }
            System.out.print(thread.getName() + " :");
            print_k();
        }
    }
}
