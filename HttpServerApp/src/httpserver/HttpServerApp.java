package httpserver;

//Java Program to Set up a Basic HTTP Server
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

//Driver Class
public class HttpServerApp 
{
 // Main Method
 public static void main(String[] args) throws IOException 
 
 
 {
	
	 
	 //http://localhost:8000/hello
	 
     // Create an HttpServer instance
     HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

     // Create a context for a specific path and set the handler
     server.createContext("/login", new MyHandler());

     // Start the server
     server.setExecutor(null); // Use the default executor
     server.start();

     System.out.println("Server is running on port 8000");
 }

 // define a custom HttpHandler
 static class MyHandler implements HttpHandler {
     @Override
     public void handle(HttpExchange exchange) throws IOException 
     {
         // handle the request
         String response = "Hello, this is a simple HTTP server response!";
         exchange.sendResponseHeaders(200, response.length());
         OutputStream os = exchange.getResponseBody();
         os.write(response.getBytes());
         os.close();
     }
 }
}
