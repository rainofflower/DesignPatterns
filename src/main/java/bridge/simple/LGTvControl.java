package bridge.simple;

public class LGTvControl extends LGControl implements TvControl {
	private static int ch = 0;
	private static boolean ison = false;
	
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

	
	public void nextChannel() {
		// TODO Auto-generated method stub
		ch++;
		super.setChanneL(ch);
	}

	
	public void preChannel() {
		// TODO Auto-generated method stub
		ch--;
		if(ch<0){
			ch = 200;
		}
		super.setChanneL(ch);
	}

}
