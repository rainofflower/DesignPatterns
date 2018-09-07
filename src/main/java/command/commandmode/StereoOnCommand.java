package command.commandmode;

import command.device.Stereo;

public class StereoOnCommand implements Command {

	private Stereo stereo;
	
	public StereoOnCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	
	public void execute() {
		// TODO Auto-generated method stub
		stereo.On();
		stereo.SetCd();
	}

	
	public void undo() {
		// TODO Auto-generated method stub
		stereo.Off();
	}

}
