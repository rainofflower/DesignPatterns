
package observer.boyfriend;

import java.util.ArrayList;
import java.util.List;

public class PrettyGirl implements Girl{
	
	private List<BoyFriend> boylist = new ArrayList<BoyFriend>();
	private String msg="Œ“…˙≤°¡À";
	@Override
	public void attachBoyFriend(BoyFriend boyFriend) {
		// TODO Auto-generated method stub
		boylist.add(boyFriend);
	}

	@Override
	public void deleteBoyFriend(BoyFriend boyFriend) {
		// TODO Auto-generated method stub
		boylist.remove(boyFriend);
	}

	@Override
	public void notifyAllBoyFriend() {
		// TODO Auto-generated method stub
		for(BoyFriend boyFriend:boylist){
			boyFriend.update(msg);
		}
	}

}
