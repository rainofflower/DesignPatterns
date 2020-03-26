package chain;

public class TailHandler extends Handler {

	public TailHandler(String name) {
		super(name);
	}

	@Override
	public void processRequest(Request request) {
		System.out.println("This request "+request.getId()+" could not find a matching handler");
	}

}
