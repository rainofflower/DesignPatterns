package bridge.usebridge.control;

public class SharpControl implements Control {

	@Override
	public void On() {
		// TODO Auto-generated method stub
		System.out.println("open Sharp tv");
	}

	@Override
	public void Off() {
		// TODO Auto-generated method stub
		System.out.println("off Sharp tv");
	}

	@Override
	public void setChannel(int ch) {
		// TODO Auto-generated method stub
		System.out.println("the Sharp tv channel is setted "+ch);
	}

	@Override
	public void setVolumn(int vol) {
		// TODO Auto-generated method stub
		System.out.println("the Sharp tv volumn is setted "+vol);
	}

}
