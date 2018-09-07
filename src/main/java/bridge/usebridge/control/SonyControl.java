package bridge.usebridge.control;

public class SonyControl implements Control {

	
	public void On() {
		// TODO Auto-generated method stub
		System.out.println("open sony tv");
	}

	
	public void Off() {
		// TODO Auto-generated method stub
		System.out.println("off sony tv");
	}

	
	public void setChannel(int ch) {
		// TODO Auto-generated method stub
		System.out.println("the sony tv channel is setted "+ch);
	}

	
	public void setVolumn(int vol) {
		// TODO Auto-generated method stub
		System.out.println("the sony tv volumn is setted "+vol);
	}

}
