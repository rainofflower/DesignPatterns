package bridge.simple;

public class LGControl implements Control {

	
	public void On() {
		// TODO Auto-generated method stub
		System.out.println("open LG tv");
	}

	
	public void Off() {
		// TODO Auto-generated method stub
		System.out.println("off LG tv");
	}

	
	public void setChanneL(int ch) {
		// TODO Auto-generated method stub
		System.out.println("the LG tv channel is setted "+ch);
	}

	
	public void setVolumn(int vol) {
		// TODO Auto-generated method stub
		System.out.println("the LG tv volumn is setted "+vol);
	}

}
