package proxy;

public class CommandExecutorProxy implements CommandExecutor {

	private boolean isAdmin;
	private CommandExecutor commandExecutor;

	public CommandExecutorProxy(String user, String pwd) {

		if (user.equals("javeed") && pwd.equals("tiger")) {
			isAdmin = true;
			commandExecutor = new CommandExecutorImp();

		}

	}

	@Override
	public void runCommand(String cmd) throws Exception {

		if(isAdmin) {
			
			
			commandExecutor.runCommand(cmd);
			
		}
		else {
			
			
			throw new Exception("Sorry ! only admin can run commands");
			
		}
		
		
	}

}
