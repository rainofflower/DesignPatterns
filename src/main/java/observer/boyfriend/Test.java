package observer.boyfriend;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZhangBoyFriend zhangBoyFriend = new ZhangBoyFriend();
		LiBoyFriend liBoyFriend = new LiBoyFriend();
		WangBoyFriend wangBoyFriend = new WangBoyFriend();
		
		PrettyGirl girl = new PrettyGirl();
		girl.attachBoyFriend(zhangBoyFriend);
		girl.attachBoyFriend(liBoyFriend);
		girl.attachBoyFriend(wangBoyFriend);
		girl.deleteBoyFriend(wangBoyFriend);
		
		girl.notifyAllBoyFriend();
		
	}

}
