package client.server.app;

//Java program demonstrates the 
//working of client-side programming
//using ServerSocket class
import java.io.*;
import java.net.*;

public class ClientApp {

 // Main driver method
 public static void main(String[] args) {

     // Try block to check if exception occurs
     try {

         // Creating Socket class object and
         // initializing Socket
         Socket s = new Socket("localhost", 6666);

         DataOutputStream d = new DataOutputStream(
             s.getOutputStream());

         // Message to be displayed
         d.writeUTF("Hello  Readers! Am client");
         d.writeUTF("I am Javeed from client");

         // Flushing out internal buffers,
         // optimizing for better performance
         d.flush();

         // Closing the connections

         // Closing DataOutputStream
         d.close();
         // Closing socket
         s.close();
     }

     // Catch block to handle exceptions
     catch (Exception e) {

         // Print the exception on the console
         System.out.println(e);
     }
 }
}
