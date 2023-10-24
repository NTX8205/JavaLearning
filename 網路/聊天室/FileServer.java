package 網路.聊天室;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer{
	public static void main(String[] args) throws Exception	{
		ServerSocket ssock = new ServerSocket(5000);
		Socket socket = ssock.accept();
		InetAddress IA = InetAddress.getByName("localhost");
		File file = new File("xampp-windows-x64-7.2.29-1-VC15-installer.exe");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		OutputStream os = socket.getOutputStream();
		byte[] contents;
		long fileLength = file.length();
		long current = 0;
		long start = System.nanoTime();
		while(current!=fileLength){
			int size = 10000;
			if(fileLength - current >= size){
				current += size;
			}else{
				size = (int)(fileLength - current);
				current = fileLength;
			}
			contents = new byte[size];
			bis.read(contents, 0, size);
			os.write(contents);
			System.out.println("Sending file ... "+(current*100)/fileLength+"% complete!");
		}
		os.flush();
		//File transfer done. Close the socket connection!
		socket.close();
		ssock.close();
		System.out.println("File sent succesfully!");
	} 
}