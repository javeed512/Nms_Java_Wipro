package sockets;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;

public class SocketChennalClient2 {

	

		   public static void main(String[] args) throws IOException {
		      ServerSocketChannel serverSocket = null;
		      SocketChannel client = null;
		      serverSocket = ServerSocketChannel.open();
		      serverSocket.socket().bind(new InetSocketAddress(5040));
		      client = serverSocket.accept();  // send request to server , so that server will accept request and get connected
		      System.out.println("Connection Set:  " + client.getRemoteAddress());
		      Path path = Paths.get("D:/wipro/output.txt");
		      FileChannel fileChannel = FileChannel.open(path, 
		         EnumSet.of(StandardOpenOption.CREATE, 
		            StandardOpenOption.TRUNCATE_EXISTING,
		            StandardOpenOption.WRITE)
		         );      
		      ByteBuffer buffer = ByteBuffer.allocate(1024);
		      while(client.read(buffer) > 0) {
		         buffer.flip();
		         fileChannel.write(buffer);
		         buffer.clear();
		      }
		      fileChannel.close();
		      System.out.println("File Received");
		      client.close();
		   }
}

