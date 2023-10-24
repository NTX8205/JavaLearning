package 網路.聊天室;

import java.io.*;
import java.net.*;
 
public class WriteThread extends Thread {
    private PrintWriter writer;
    private Socket socket;
    private ReadThread r1;
    private ChatClient client;
 
    public WriteThread(Socket socket,ReadThread r, ChatClient client) {
        this.socket = socket;
        this.r1=r;
        this.client = client;
 
        try {
            OutputStream output = socket.getOutputStream();
            writer = new PrintWriter(output, true);
        } catch (IOException ex) {
            System.out.println("Error getting output stream: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
 
    public void closeall() {
    	try {
        	socket.close();
            writer.close();
        } catch (IOException ex) {
 
            System.out.println("Error writing to server: " + ex.getMessage());
        }
    }
    public void run() {
 
        Console console = System.console();
 
        String userName = console.readLine("\nEnter your name: ");
        client.setUserName(userName);
        writer.println(userName);
 
        String text;
 
        do {
            text = console.readLine("[" + userName + "]: ");
            writer.println(text);
            if (text.equals("bye")) {
            	r1.closeall();
            	break;
            }
        } while (true);
        try {
        	sleep(1000);
        }catch(Exception e) {
        	System.out.println(e);
        }
        closeall();
        
    }
}