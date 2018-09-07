package command.commandmode;

import command.device.Stereo;

public class StereoSubVolCommand implements Command {
	
	private Stereo stereo;
	
	public StereoSubVolCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		int vol = stereo.GetVol();
		if(vol>0){
			stereo.SetVol(--vol);
		}
	}

	
	public void undo() {
		// TODO Auto-generated method stub
		int vol = stereo.GetVol();
		if(vol<11){
			stereo.SetVol(++vol);
		}
	}

}
