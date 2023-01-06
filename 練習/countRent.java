package 練習;

import java.util.Scanner;
public class countRent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            String id = sc.next();
            if (id.equals("A01")) {
                Sedan a01 = new Sedan(id, 2500);
                a01.showcarInfo();
                total += a01.getCarPrice();
            } else if (id.equals("A02")) {
                Sedan a02 = new Sedan(id, 2600);
                a02.showcarInfo();
                total += a02.getCarPrice();
            } else if (id.equals("B01")) {
                Suv b01 = new Suv(id, 3500);
                b01.showcarInfo();
                total += b01.getCarPrice();
            } else if (id.equals("B02")) {
                Suv b02 = new Suv(id, 4500);
                b02.showcarInfo();
                total += b02.getCarPrice();
            }
        }
        System.out.println("Total Price: " + total);
        sc.close();
    }

}

class car {
    protected String car_id;
    protected int car_price;

    public car(String set_car_id, int set_carprice) {
        this.car_id = set_car_id;
        this.car_price = set_carprice;
    }

    int getCarPrice() {
        return car_price;
    }

    String getCarID() {
        return car_id;
    }
}

interface CarInformation {
    void showcarInfo();
}

class Sedan extends car implements CarInformation {
    public Sedan(String set_car_id, int set_carprice) {
        super(set_car_id, set_carprice);
        this.car_id = set_car_id;
        this.car_price = set_carprice;
    }

    public void showcarInfo() {
        System.out.println("CarID: " + car_id + ", Type: Sedan, Price: " + car_price);
    }
}

class Suv extends car implements CarInformation {
    public Suv(String set_car_id, int set_carprice) {
        super(set_car_id, set_carprice);
        this.car_id = set_car_id;
        this.car_price = set_carprice;
    }

    public void showcarInfo() {
        System.out.println("CarID: " + car_id + ", Type: Suv, Price: " + car_price);
    }
}