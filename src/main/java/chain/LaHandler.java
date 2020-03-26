package chain;

public class LaHandler extends Handler {

	public LaHandler(String name) {
		super(name);
	}

	@Override
	public void processRequest(Request request) {
		if(request.getNumber() < 6){
			//ƥ��ɹ����Լ���������
			System.out.println("This request "+request.getId()+" is handled by "+this.Name);
		}
		else{
			//����������һ�������ߴ���
			successor.processRequest(request);
		}
	}

}
