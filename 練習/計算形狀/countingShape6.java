package 練習.計算形狀;

public class countingShape6 {
    public static void main(String[] args) {
        shape3 s;
        s = new rectangle3();
        s.draw();
        s = new triangle3();
        s.draw();
        s = new circle3();
        s.draw();
        s = new square3();
        s.draw();

        System.out.println();

        rectangle3 r = new square3();
        r.draw();

    }
}

abstract class shape3 {
    abstract void draw();
}

class rectangle3 extends shape3 {
    void draw() {
        System.out.println("drawing rectangle");
    }
}

class triangle3 extends shape3 {
    void draw() {
        System.out.println("drawing triangle");
    }
}

class circle3 extends shape3 {
    void draw() {
        System.out.println("drawing circle");
    }
}

class square3 extends rectangle3 {
    void draw() {
        System.out.println("drawing square");
    }
}