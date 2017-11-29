package chain;

public abstract class Handler {
	Handler successor;
	String Name;
	public Handler(String Name) {
		this.Name = Name;
	}
	public abstract void ProcessRequest(Request request);
	public void SetSuccessor(Handler successor){
		this.successor = successor;
	}
}
