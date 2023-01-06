package 網路;

import java.io.*;
import java.net.*;
import java.util.Date;
import java.util.Scanner;

class DateClient2 {
    public static void main(String args[]) {
        try {
            Socket soc = new Socket("127.0.0.1", 5217);
            DataOutputStream out = new DataOutputStream(soc.getOutputStream());
            out.writeBytes("Hi!! Server!! \n");
            System.out.println(new Date());
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println("Receive from Server:" + in.readLine());
            String s = in.readLine();
            Scanner scanner = new Scanner(System.in);
            String s2 = scanner.nextLine();
            out.writeBytes(s2 + " \n");
            System.out.println("Receive from Server:" + s);
            out.writeBytes("quit!");
            out.close();
            in.close();
            scanner.close();
            soc.close();
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
    }
}
