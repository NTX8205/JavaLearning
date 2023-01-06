package 網路.聊天室;

import java.net.*;
import java.io.*;

public class ChatClient {
    private String hostname;
    private int port;
    private String userName;
    ReadThread r1;
    WriteThread w1;

    public ChatClient(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
    }

    public void stop() {
        r1.closeall();
        w1.closeall();
    }

    public void execute() {
        try {
            Socket socket = new Socket(hostname, port);

            System.out.println("Connected to the chat server");

            r1 = new ReadThread(socket, this);
            r1.start();
            w1 = new WriteThread(socket, r1, this);
            w1.start();

        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        }

    }

    void setUserName(String userName) {
        this.userName = userName;
    }

    String getUserName() {
        return this.userName;
    }

    public static void main(String[] args) {
        if (args.length < 2)
            return;

        String hostname = args[0];
        int port = Integer.parseInt(args[1]);

        ChatClient client = new ChatClient(hostname, port);
        client.execute();
    }
}