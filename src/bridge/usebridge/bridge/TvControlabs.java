package bridge.usebridge.bridge;

import bridge.usebridge.control.Control;

public abstract class TvControlabs {
	Control control = null;
	public TvControlabs(Control control){
		this.control = control;
	}
	
	public abstract void Onoff();
	public abstract void nextChannel();
	public abstract void preChannel();
}
