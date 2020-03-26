package chain;

public class MainTest {

	public static void main(String[] args) {
		Request request = new Request(7);
		DOHandler doHandler = new DOHandler("do");
		LaHandler laHandler = new LaHandler("la");
		doHandler.setSuccessor(laHandler);
		TailHandler tail = new TailHandler("tail");
		laHandler.setSuccessor(tail);
		doHandler.processRequest(request);
	}

}
