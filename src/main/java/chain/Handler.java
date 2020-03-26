package chain;

public abstract class Handler {
	Handler successor;
	String Name;
	public Handler(String Name) {
		this.Name = Name;
	}
	public abstract void processRequest(Request request);
	public void setSuccessor(Handler successor){
		this.successor = successor;
	}
}
