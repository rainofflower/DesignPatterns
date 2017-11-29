package bridge.simple;

public class LGControl implements Control {

	@Override
	public void On() {
		// TODO Auto-generated method stub
		System.out.println("open LG tv");
	}

	@Override
	public void Off() {
		// TODO Auto-generated method stub
		System.out.println("off LG tv");
	}

	@Override
	public void setChanneL(int ch) {
		// TODO Auto-generated method stub
		System.out.println("the LG tv channel is setted "+ch);
	}

	@Override
	public void setVolumn(int vol) {
		// TODO Auto-generated method stub
		System.out.println("the LG tv volumn is setted "+vol);
	}

}
