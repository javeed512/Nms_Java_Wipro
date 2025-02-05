package command;

public class Client {

	public static void main(String[] args) {
		 // Create devices
        TV tv = new TV();
        Stereo stereo = new Stereo();
 
        
     // Create command objects
        Command turnOnTVCommand = new TurnOnCommand(tv);
        Command turnOffTVCommand = new TurnOffCommand(tv);
        Command changeChannelTVCommand = new ChangeChannelCommand(tv);
        
        
        Command turnOnStereoCommand = new TurnOnCommand(stereo);
        Command adjustVolumeStereoCommand = new AdjustVolumeCommand(stereo);
     
        
        
     // Create remote control
        RemoteControl remote = new RemoteControl();
 
        // Set and execute commands
        remote.setCommand(turnOnTVCommand);
        remote.pressButton(); // Outputs: TV is now on
        
     // Set and execute commands
        remote.setCommand(changeChannelTVCommand);
        remote.pressButton(); // Outputs: TV channel change
        
        
        
        // Set and execute commands
        remote.setCommand(turnOnStereoCommand);
        remote.pressButton(); // Outputs: Stereo is now on
        

     // Set and execute commands
        remote.setCommand(adjustVolumeStereoCommand);
        remote.pressButton(); // Outputs: Stereo volume adjust
        
        
        remote.setCommand(turnOffTVCommand);
        remote.pressButton(); // button turn off   // it off tv
        
	}

}
