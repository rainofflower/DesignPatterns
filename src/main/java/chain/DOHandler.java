package chain;

public class DOHandler extends Handler {

	public DOHandler(String name) {
		super(name);
	}

	@Override
	public void processRequest(Request request) {
		if(request.getNumber()<5){
			//ƥ��ɹ����Լ���������
			System.out.println("This request "+request.getId()+" is handled by "+this.Name);
		}
		else{
			//����������һ�������ߴ���
			successor.processRequest(request);
		}
	}

}
