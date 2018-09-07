package chain;

public class GroupHandler extends Handler {
	public GroupHandler(String Name) {
		super(Name+" GroupLeader");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ProcessRequest(Request request) {
		// TODO Auto-generated method stub
		if(request.getSum()<5000){
			//匹配成功则自己处理请求
			System.out.println("This request "+request.getID()+" is handled by "+this.Name);
		}
		else{
			//传递请求到下一个处理者处理
			successor.ProcessRequest(request);
		}
	}

}
