package bridge.simple;

public class SonyTvControl extends SonyControl implements TvControl {
	private static int ch = 0;
	private static boolean ison = false;
	@Override
	public void Onoff() {
		// TODO Auto-generated method stub
		if(ison){
			ison = false;
			super.Off();
		}
		else{
			ison = true;
			super.On();
		}
	}

	@Override
	public void nextChannel() {
		// TODO Auto-generated method stub
		ch++;
		super.setChanneL(ch);
	}

	@Override
	public void preChannel() {
		// TODO Auto-generated method stub
		ch--;
		if(ch<0){
			ch = 200;
		}
		super.setChanneL(ch);
	}

}
