package command;

//Concrete command for turning a device on
class TurnOnCommand implements Command {
 private Device device;

 public TurnOnCommand(Device device) {
     this.device = device;
 }

 @Override
 public void execute() {
     device.turnOn();
 }
}