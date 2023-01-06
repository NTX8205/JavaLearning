package 練習.抽象和介面;

public class test2 {
    public static void main(String[] args) {
        dog a = new dog();
        a.walk();
        a.jump();

    }
}

interface dogfather {
    void walk();
}

interface dogmother {
    void jump();
}

class dog implements dogfather, dogmother {

    public void walk() {
        System.out.println("I can walk.");
    }

    public void jump() {
        System.out.println("I can jump.");
    }
}