package 練習.抽象和介面;

public class test3 {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();

    }

}

abstract class Ani {

    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pig extends Ani {
    public void animalSound() {
        System.out.println("The pig says : wee wee");
    }
}