package bridge.usebridge.bridge;

import bridge.usebridge.control.SharpControl;
import bridge.usebridge.control.SonyControl;

public class MainTest {

	public static void main(String[] args){
		/*TvControl LGTvControl;
		TvControl SonyTvControl;
		LGTvControl = new TvControl(new SonyControl());
		SonyTvControl = new TvControl(new SonyControl());
		LGTvControl.Onoff();
		LGTvControl.nextChannel();
		LGTvControl.nextChannel();
		LGTvControl.preChannel();
		LGTvControl.Onoff();
		
		SonyTvControl.Onoff();
		SonyTvControl.preChannel();
		SonyTvControl.preChannel();
		SonyTvControl.Onoff();*/
		
		NewTvControl SharpTvControl;
		SharpTvControl = new NewTvControl(new SharpControl());
		SharpTvControl.Onoff();
		SharpTvControl.nextChannel();
		SharpTvControl.setChannel(7);
		SharpTvControl.setChannel(18);
		SharpTvControl.Back();
		SharpTvControl.Onoff();
		
	}
}
