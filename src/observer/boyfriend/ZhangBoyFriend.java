package observer.boyfriend;

public class ZhangBoyFriend implements BoyFriend {

	@Override
	public void update(String msg) {
		// TODO Auto-generated method stub
		if(msg.equals("我生病了")){
			System.out.println("我马上过来");
		}
	}

}
