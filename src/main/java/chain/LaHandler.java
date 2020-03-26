package chain;

public class LaHandler extends Handler {

	public LaHandler(String name) {
		super(name);
	}

	@Override
	public void processRequest(Request request) {
		if(request.getNumber() < 6){
			//匹配成功则自己处理请求
			System.out.println("This request "+request.getId()+" is handled by "+this.Name);
		}
		else{
			//传递请求到下一个处理者处理
			successor.processRequest(request);
		}
	}

}
