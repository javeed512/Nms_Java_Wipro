package channel.buffer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class ChannelBufferRWDemo {

	 public static void main(String args[]) throws IOException 
	  {
	    FileInputStream input = new FileInputStream ("Input.txt");
	    ReadableByteChannel source = input.getChannel();
	     
	    FileOutputStream output = new FileOutputStream ("Output.txt");
	    WritableByteChannel dest = output.getChannel();
	 
	    copyData(source, dest);
	 
	    source.close();
	    dest.close();
	  }
	 
	  private static void copyData(ReadableByteChannel src, WritableByteChannel dest) throws IOException 
	  {
	    ByteBuffer buffer = ByteBuffer.allocateDirect(16 * 1024);
	 
	    while (src.read(buffer) != -1) 
	    {
	      // Prepare the buffer to be drained
	      buffer.flip();
	 
	      // Make sure that the buffer was fully drained
	      while (buffer.hasRemaining()) 
	      {
	        dest.write(buffer);
	      }
	 
	      // Make the buffer empty, ready for filling
	      buffer.clear();
	    }
	  }
	
	
	
	
	
}
