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
			//ƥ��ɹ����Լ���������
			System.out.println("This request "+request.getID()+" is handled by "+this.Name);
		}
		else{
			//����������һ�������ߴ���
			successor.ProcessRequest(request);
		}
	}

}
