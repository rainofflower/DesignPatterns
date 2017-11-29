package bridge.simple;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LGTvControl LGTvControl = new LGTvControl();
		SonyTvControl sonyTvControl = new SonyTvControl();
		
		LGTvControl.Onoff();
		LGTvControl.nextChannel();
		LGTvControl.nextChannel();
		LGTvControl.preChannel();
		LGTvControl.Onoff();
		
		sonyTvControl.Onoff();
		sonyTvControl.preChannel();
		sonyTvControl.preChannel();
		sonyTvControl.preChannel();
		sonyTvControl.Onoff();
	}

}
