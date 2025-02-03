package sockets;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SocketChennalServer {
	
	 public static void main(String[] args) throws IOException {
	      SocketChannel server = SocketChannel.open();
	      SocketAddress socketAddr = new InetSocketAddress("0.0.0.0", 5040);  // server address and port
	      server.connect(socketAddr);
	      Path path = Paths.get("C:/Test/input.txt");
	      FileChannel fileChannel = FileChannel.open(path);
	      ByteBuffer buffer = ByteBuffer.allocate(1024);
	      while(fileChannel.read(buffer) > 0) {
	         buffer.flip();
	         server.write(buffer);
	         buffer.clear();
	      }
	      fileChannel.close();
	      System.out.println("File Sent");
	      server.close();
	   }
	

}
