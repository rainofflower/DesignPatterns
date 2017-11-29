package bridge.simple;

public class SonyControl implements Control {

	@Override
	public void On() {
		// TODO Auto-generated method stub
		System.out.println("open sony tv");
	}

	@Override
	public void Off() {
		// TODO Auto-generated method stub
		System.out.println("off sony tv");
	}

	@Override
	public void setChanneL(int ch) {
		// TODO Auto-generated method stub
		System.out.println("the sony tv channel is setted "+ch);
	}

	@Override
	public void setVolumn(int vol) {
		// TODO Auto-generated method stub
		System.out.println("the sony tv volumn is setted "+vol);
	}

}
