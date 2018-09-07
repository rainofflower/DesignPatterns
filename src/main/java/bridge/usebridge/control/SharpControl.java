package bridge.usebridge.control;

public class SharpControl implements Control {

	
	public void On() {
		// TODO Auto-generated method stub
		System.out.println("open Sharp tv");
	}

	
	public void Off() {
		// TODO Auto-generated method stub
		System.out.println("off Sharp tv");
	}

	
	public void setChannel(int ch) {
		// TODO Auto-generated method stub
		System.out.println("the Sharp tv channel is setted "+ch);
	}

	
	public void setVolumn(int vol) {
		// TODO Auto-generated method stub
		System.out.println("the Sharp tv volumn is setted "+vol);
	}

}
