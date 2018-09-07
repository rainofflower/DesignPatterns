package observer.boyfriend;

public interface Girl {
	//×¢²áÄĞÅóÓÑ
	void attachBoyFriend(BoyFriend boyFriend);
	//É¾³ıÄĞÅóÓÑ
	void deleteBoyFriend(BoyFriend boyFriend);
	//Í¨ÖªËùÓĞÄĞÅóÓÑ
	void notifyAllBoyFriend();
}
