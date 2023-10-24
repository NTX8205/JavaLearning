package 網路;

import java.io.*;
import java.net.*;
import java.util.Date;

class DateClient {
    public static void main(String args[]) {
        try {
            Socket soc = new Socket("::1", 5217);
            System.out.println(new Date());
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());
            soc.close();
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
    }
}
