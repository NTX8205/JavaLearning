package 練習;

//Quadratic Formula 一元二次方程式解
import java.util.*;

public class quadratic_formula {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        try {
            Quadratic result = new Quadratic(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            sc.close();
            Double check = result.root();
            if (result.checkdisc() <= 0) {
                throw new IllegalArgumentException("Discriminant < zero.");
            } else if (check.isNaN()) {
                throw new IllegalArgumentException(result.check() + " can't be zero.");

            } else {
                System.out.println("A solution of the equation is " + result.root());
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Sorry, I can't find a solution.");
            System.out.println(e.getMessage());
        } catch (InputMismatchException input) {
            System.out.println("Illegal input.");
        }
    }
}

class Quadratic {
    double A, B, C;

    public Quadratic(double x, double y, double z) {
        this.A = x;
        this.B = y;
        this.C = z;
    }

    String check() {
        if (A == 0) {
            return "A";
        } else if (B == 0) {
            return "B";
        } else {
            return "C";
        }
    }

    double checkdisc() {
        double disc = Math.abs(Math.pow(B, 2)) - 4 * A * C;
        return disc;
    }

    double root() {
        double disc = Math.abs(Math.pow(B, 2)) - 4 * A * C;
        double x1 = (-B + Math.sqrt(disc)) / (2 * A);
        return x1;
    }
}