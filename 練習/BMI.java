package 練習;

import java.util.*;
class Obesity extends Exception {

    public Obesity(String s) {
        super(s);
    }
}

public class BMI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            sc.close();
            double BMI = (double) weight / ((double) height * (double) height / 10000);

            System.out.printf("Given height: %d (cm) and weight: %d (Kg), your BMI is %.1f\n", height, weight, BMI);

            if (isBMIOK(BMI)) {
                System.out.println("You are not fat.");
            } else {
                throw new Obesity("you are obese, eat less and exercise more!");
            }

        } catch (InputMismatchException inputMismatchException) {
            inputMismatchException.printStackTrace();
        } catch (Obesity obesity) {
            System.err.println(obesity.getMessage());
        }

    }

    public static boolean isBMIOK(double bmi) {
        if (bmi >= 24) {
            return false;
        } else {
            return true;
        }
    }
}
