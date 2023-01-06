package 網路;

import java.net.*;
import java.io.*;
import java.util.*;

class DateServer {
    public static void main(String args[]) {
        try {
            InetAddress v6 = InetAddress.getByName("127.0.0.1");
            ServerSocket s = new ServerSocket(5217,2);
            while (true) {
                System.out.println("Waiting For Connection ...");
                Socket soc = s.accept();
                DataOutputStream out = new DataOutputStream(soc.getOutputStream());
                out.writeBytes("Server Date: " + (new Date()).toString() + "\n");
                System.out.println("Server getPort" + s.getLocalPort());
                System.out.println("Server getAddr" + s.getInetAddress());
                System.out.println("Server getSoc" + s.getLocalSocketAddress());
                out.close();
                soc.close();
                // s.close();
            }
        } catch (Exception e) {
            System.out.println("error:" + e);
            System.exit(0);
        }
    }

}
