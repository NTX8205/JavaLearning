package 網路;

import java.net.*;
import java.io.*;
import java.util.*;

class DateServer2 {
    public static void main(String args[]) {
        try {
            ServerSocket s = new ServerSocket(5217);

            while (true) {
                System.out.println("Waiting For Connection ...");
                Socket soc = s.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                System.out.println("Receive from client:" + in.readLine());

                DataOutputStream out = new DataOutputStream(soc.getOutputStream());
                out.writeBytes("Hi!! Hi!! \n");
                out.writeBytes("Server Date: " + (new Date()).toString() + "\n");
                String str = in.readLine();
                while (str != null) {
                    str = in.readLine();
                }
                out.close();
                in.close();
                soc.close();
                s.close();
            }
            
        } catch (Exception e) {
            System.out.println("error:" + e);
            System.exit(0);
        }
    }

}
