package 網路;

import java.io.*;
import java.net.*;
public class UDP_Client {
	// port : 連接埠
	int port;            
    //欲連結是伺服器 IP
	InetAddress server;
	// 欲傳送的訊息，每個 Client 只能傳送一個訊息
    String msg;            
	public UDP_Client(String pServer, int pPort, String pMsg) {
		try {
			port = pPort;
	        server = InetAddress.getByName(pServer);
	        msg = pMsg;
		}catch (Exception e) {
			System.out.println(e);
		}
	}
    public void run() {
        try {
              // 封裝該位元串成為封包 
              byte buffer[] = msg.getBytes();                 
              //設定DatagramPacket內容為剛剛的buffer，同時指定傳送對象
              DatagramPacket packet = new DatagramPacket(buffer, buffer.length, server, port); 
              DatagramSocket socket = new DatagramSocket();    
              //直接傳送封包
              socket.send(packet);                             
              socket.close();
          } catch (Exception e) { 
              System.out.println(e);
          }
  }
  public static void main(String[] args) {
      for (int i=0; i<100; i++) {
          // 建立 UdpClient，設定傳送對象與傳送訊息
          UDP_Client client = new UDP_Client("127.0.0.1", 5555, "UdpClient : "+i+"th message");
          client.run(); 
      }
  }

}
