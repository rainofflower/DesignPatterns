package command.tradition;

import command.device.Light;
import command.device.Stereo;

public class ControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Control ctl;
		Light light = new Light("bedroom");
		Stereo stereo = new Stereo();
		ctl = new TraditionControl(light, stereo);
		
		ctl.onButton(0);
		ctl.offButton(0);
		ctl.onButton(1);
		ctl.onButton(2);
		ctl.offButton(2);
		
		ctl.offButton(1);
	}

}
