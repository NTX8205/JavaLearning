package 網路.聊天室;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Update implements Runnable {

    private final static int serverPort = 5555;
    private final static String fileInput = "xampp-windows-x64-7.2.29-1-VC15-installer.exe";

    public static void main(String args[]) throws IOException{
        ServerSocket servsock = new ServerSocket(serverPort);
        File myFile = new File(fileInput);
        while (true) {
          Socket sock = servsock.accept();
          byte[] mybytearray = new byte[(int) myFile.length()];
          BufferedInputStream bis = new BufferedInputStream(new FileInputStream(myFile));
          bis.read(mybytearray, 0, mybytearray.length);
          OutputStream os = sock.getOutputStream();
          os.write(mybytearray, 0, mybytearray.length);
          os.flush();
          sock.close();
		  System.out.println("File transfer complete, close connection!");
        }
    }

    public static void start(){
        Update upd = new Update();  
        Thread tupd = new Thread(upd);  
        tupd.start(); 
    }

    @Override
    public void run() {

    }
}