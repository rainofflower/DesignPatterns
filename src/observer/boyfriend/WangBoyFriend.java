package observer.boyfriend;

public class WangBoyFriend implements BoyFriend {

	@Override
	public void update(String msg) {
		// TODO Auto-generated method stub
		if(msg.equals("我生病了")){
			System.out.println("关我毛事啊");
		}
	}

}
