package 網路;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest extends Thread {
    Socket socket = null;
    OutputStream out = null;
    InputStream in = null;

    public void run() {
        int i = 1;
        while (true) {
            try {
                socket = new Socket("127.0.0.1", 8000);
                out = socket.getOutputStream();
                out.write(("client sent hello " + i).getBytes());
                out.flush();
                in = socket.getInputStream();
                byte[] buffer = new byte[1024];
                // int len = in.read(buffer, 0, 1024);
                String inData = new String(buffer);
                System.out.println(inData);
                i++;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (in != null) {
                        in.close();
                    }
                    if (out != null) {
                        out.close();
                    }
                    if (socket != null) {
                        socket.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        ClientTest c1 = new ClientTest();
        ClientTest c2 = new ClientTest();
        c1.start();
        c2.start();
    }
}
