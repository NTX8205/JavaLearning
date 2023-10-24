package 網路;


public class Thread_main {
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest("Hello World! 1");
        ThreadTest t2 = new ThreadTest("Hello World! 2");
        ThreadTest t3 = new ThreadTest("Hello World! 3");
        ThreadTest t4 = new ThreadTest("Hello World! 4");
        ThreadTest t5 = new ThreadTest("Hello World! 5");
        ThreadTest t6 = new ThreadTest("Hello World! 6");
        ThreadTest t7 = new ThreadTest("Hello World! 7");
        ThreadTest t8 = new ThreadTest("Hello World! 8");
        ThreadTest t9 = new ThreadTest("Hello World! 9");
        ThreadTest t10 = new ThreadTest("Hello World! 10");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }

}
