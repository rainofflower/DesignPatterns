package observer.boyfriend;

public class ZhangBoyFriend implements BoyFriend {

	@Override
	public void update(String msg) {
		// TODO Auto-generated method stub
		if(msg.equals("��������")){
			System.out.println("�����Ϲ���");
		}
	}

}
