package 網路.聊天室;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

    private final static String serverIP = "127.0.0.1";
    private final static int serverPort = 5555;
    private final static String fileOutput = "xampp-windows-x64-7.2.29-1-VC15-installer_1.exe";

    public static void main(String args[]) throws UnknownHostException, IOException {
        Socket sock = new Socket(serverIP, serverPort);
        byte[] mybytearray = new byte[1024];
        InputStream is = sock.getInputStream();
        FileOutputStream fos = new FileOutputStream(fileOutput);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
		int bytesRead=0;
		while ((bytesRead = is.read(mybytearray)) != -1) {
			fos.write(mybytearray, 0, bytesRead);
		}
        bos.close();
        sock.close();
		System.out.println("File transfer complete. Connection close. Done!!");
    }
}