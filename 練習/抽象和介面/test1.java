package 練習.抽象和介面;

public class test1 {
    public static void main(String[] args) {
        dog2 b = new dog2();
        b.walk();
        b.jump();
        b.swim();

    }
}

interface dogfather2 {
    void walk();
}

interface dogmother2 {
    void jump();
}

class granddog {
    void swim() {
        System.out.println("I can`t swim.");
    }
}

class dog2 extends granddog implements dogfather2, dogmother2 {

    public void walk() {
        System.out.println("I can walk.");
    }

    public void jump() {
        System.out.println("I can jump.");
    }

    public void swim() {
        System.out.println("I can swim");
    }
}