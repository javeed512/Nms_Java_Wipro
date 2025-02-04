package client.server.app;


	// Java program demonstrates the 
// working of server-side programming
// using ServerSocket class
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

	public class ServerApp {
	    public static void main(String[] args) {
	        try {
	            System.out.println("Starting server...");

	            // Create a ServerSocket listening on port 6666
	            ServerSocket ss = new ServerSocket(6666);
	            System.out.println("Server started. Listening on port 6666...");

	            // Accept a connection from a client
	            Socket s = ss.accept();
	            System.out.println("Client connected!");

	            // Read the message from the client
	            DataInputStream d = new DataInputStream(s.getInputStream());
	            String str = d.readUTF();
	            System.out.println("Message: " + str);
	            
	            String str2 = d.readUTF();
	            
	            System.out.println("Message2 : "+str2);

	            // Close the socket
	            ss.close();
	        } catch (Exception e) {
	            System.out.println("Server Error: " + e);
	        }
	    }
	}
