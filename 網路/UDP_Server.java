package 網路;

import java.io.*;
import java.net.*;

public class UDP_Server {
    int port;

    public UDP_Server(int pPort) {
    
// 設定連接埠​
        port = pPort;                            
    }
    public void run() {
        try {
        // 設定最大的訊息大小為 8192​
        final int SIZE = 8192;                    
        // 設定訊息暫存區​
            byte buffer[] = new byte[SIZE];            
            for (int count = 0; ; count++) {
                // 設定接收的 UDP Packet 大小與指定的buffer​
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                // 設定接收的 UDP Socket與port​
                DatagramSocket socket = new DatagramSocket(port);         
                //接收封包​
                socket.receive(packet);                                    
                //將接收訊息轉換為字串​
                String msg = new String(buffer, 0, packet.getLength());    
                //印出接收到的訊息​
                System.out.println(count+" : receive = "+msg);                    
                // 關閉 UDP Socket​
                socket.close();                                            
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) { 
        // 建立 UdpServer 伺服器物件​
        UDP_Server server = new UDP_Server(5555); 
        server.run();
    }
}