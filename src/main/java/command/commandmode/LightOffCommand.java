package command.commandmode;

import command.device.Light;

public class LightOffCommand implements Command {
	
	private Light light;
		
	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		light.Off();
	}

	
	public void undo() {
		// TODO Auto-generated method stub
		light.On();
	}

}
