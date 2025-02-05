package command;

//Concrete command for turning a device off
class TurnOffCommand implements Command {
 private Device device;

 public TurnOffCommand(Device device) {
     this.device = device;
 }

 @Override
 public void execute() {
     device.turnOff();
 }
}
