package 網路;

import java.io.*;
import java.net.*;
import java.util.Date;

public class ServerThread extends Thread {
    private Socket m_socket;
    BufferedReader sin1;
    DataOutputStream out;

    public ServerThread(Socket s) {
        this.m_socket = s;
    }

    @Override
    public void run() {
        // 覆寫Thread內的run()方法
        try {
            out = new DataOutputStream(m_socket.getOutputStream());
            out.writeBytes("Server Date: " + (new Date()).toString() + "\n");
            sin1 = new BufferedReader(new InputStreamReader(m_socket.getInputStream()));
            System.out.println("Receive from client:" + sin1.readLine());
            sin1.close();
            out.close();
            m_socket.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            // 出現例外時，捕捉並顯示例外訊息(連線成功不會出現例外)
        } finally {
            try {
                if (sin1 != null) {
                    sin1.close();
                }
                if (out != null) {
                    out.close();
                }
                if (m_socket != null) {
                    m_socket.close();
                }
            } catch (Exception closeErr) {
                System.out.println("close socket fail");
            }
        }
    }

    public static void main(String[] argv) {
        ServerSocket server = null;
        Socket soc = null;
        try {
            server = new ServerSocket(8000);
            while (true) {
                // listen request
                soc = server.accept();
                System.out.println("Connected!");
                ServerThread st = new ServerThread(soc);
                // new thread execution services
                st.start();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            // 出現例外時，捕捉並顯示例外訊息
        }
    }
}
