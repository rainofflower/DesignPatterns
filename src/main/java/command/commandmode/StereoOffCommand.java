package command.commandmode;

import command.device.Stereo;

public class StereoOffCommand implements Command {

	private Stereo stereo;
	
	public StereoOffCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	
	public void execute() {
		// TODO Auto-generated method stub
		stereo.Off();
	}

	
	public void undo() {
		// TODO Auto-generated method stub
		stereo.On();
		stereo.SetCd();
	}

}
