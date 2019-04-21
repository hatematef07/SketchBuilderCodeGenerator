package server;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    private static Socket socket = null;
    private static DataInputStream input = null;
    private static DataOutputStream out	 = null;
    private static boolean state = true;
    private static String address = "";
    private static int port;

    // constructor to put ip address and port
//    {
//        // establish a connection
//        try
//        {
//            socket = new Socket(address, port);
//            System.out.println("Connected");
//
//            // takes input from terminal
//            //input = new DataInputStream(System.in);
//
//            // sends output to the socket
//            out = new DataOutputStream(socket.getOutputStream());
//        }
//        catch(UnknownHostException u)
//        {
//            System.out.println(u);
//            out.write(400);
//            state = false;
//        }
//        catch(IOException i)
//        {
//            System.out.println(i);
//            out.write(400);
//            state = false;
//        }
//
//        // string to read message from input
//        int line;
//
//        // keep reading until "Over" is input
//        while (state)
//        {
////            try
////            {
////                line = input.read();
////                out.write(line);
////            }
////            catch(IOException i)
////            {
////                System.out.println(i);
////                out.write(400);
////            }
//        }
//
//    }

    public static void setOut(String message) throws IOException{
        try {
            out.writeUTF(message);
        } catch(IOException i)
        {
            System.out.println(i);
            out.writeUTF(String.valueOf(i));
        }
    }

    public static void closeConnection() {
        // close the connection
        try
        {
            input.close();
            out.close();
            socket.close();
            System.out.println("Connection closed");
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }

    public static void connect(){
        try {
            socket = new Socket(address, port);
            System.out.println("Connected");
            input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            out = new DataOutputStream(socket.getOutputStream());
            int line = 0;

//            // reads message from client until "Over" is sent
//            while (line != 400)
//            {
//                try
//                {
//                    line = input.read();
//                    System.out.println(line);
//
//                }
//                catch(IOException i)
//                {
//                    System.out.println(i);
//                }
//            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }

    public static void initializeConnection(String host, int gateway) {
        address = host;
        port = gateway;
    }
}
