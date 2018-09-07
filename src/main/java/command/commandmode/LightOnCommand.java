package command.commandmode;

import command.device.Light;

public class LightOnCommand implements Command {

	private Light light;
	
	
	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}

	
	public void execute() {
		// TODO Auto-generated method stub
		light.On();
	}

	
	public void undo() {
		// TODO Auto-generated method stub
		light.Off();
	}

}
