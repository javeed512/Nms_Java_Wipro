package proxy;

import java.io.IOException;

public class Client {

	public static void main(String[] args) throws IOException {

		
		
		
CommandExecutor proxyExecutor = new CommandExecutorProxy("tom", "tiger");

		try {
			proxyExecutor.runCommand("ls");
		} catch (Exception e) {

			System.err.println("Exception message: " + e.getMessage());

		}

	}

}
