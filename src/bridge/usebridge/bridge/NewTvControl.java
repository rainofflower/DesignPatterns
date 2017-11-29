package bridge.usebridge.bridge;

import bridge.usebridge.control.Control;

public class NewTvControl extends TvControlabs {
	private int ch = 0;
	private boolean ison = false;
	private int prech = 0;
	
	public NewTvControl(Control control) {
		super(control);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Onoff() {
		// TODO Auto-generated method stub
		if(ison){
			ison = false;
			control.Off();
		}
		else{
			ison = true;
			control.On();
		}
	}

	@Override
	public void nextChannel() {
		// TODO Auto-generated method stub
		prech = ch;
		ch++;
		control.setChannel(ch);
	}

	@Override
	public void preChannel() {
		// TODO Auto-generated method stub
		prech = ch;
		ch--;
		if(ch<0){
			ch = 200;
		}
		control.setChannel(ch);
	}
	
	public void setChannel(int nch){
		prech = ch;
		ch = nch;
		control.setChannel(ch);
	}
	
	public void Back(){
		control.setChannel(prech);
	}
}
