package command.tradition;

import command.device.Light;
import command.device.Stereo;

public class TraditionControl implements Control {

	Light light;
	Stereo stereo;
	
	
	public TraditionControl(Light light, Stereo stereo) {
		super();
		this.light = light;
		this.stereo = stereo;
	}

	
	public void onButton(int slot) {
		// TODO Auto-generated method stub
		switch(slot){
		case 0:
			light.On();
			break;
		case 1:
			stereo.On();
			break;
		case 2:
			int vol = stereo.GetVol();
			if(vol < 11){
				stereo.SetVol(++vol);
			}
			break;
		}
	}

	
	public void offButton(int slot) {
		// TODO Auto-generated method stub
		switch(slot){
		case 0:
			light.Off();
			break;
		case 1:
			stereo.Off();
			break;
		case 2:
			int vol = stereo.GetVol();
			if(vol > 0){
				stereo.SetVol(--vol);
			}
			break;
		}
	}

	
	public void undoButton() {
		// TODO Auto-generated method stub
		
	}

}
