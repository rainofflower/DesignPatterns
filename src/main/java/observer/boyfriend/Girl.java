package observer.boyfriend;

public interface Girl {
	//ע��������
	void attachBoyFriend(BoyFriend boyFriend);
	//ɾ��������
	void deleteBoyFriend(BoyFriend boyFriend);
	//֪ͨ����������
	void notifyAllBoyFriend();
}
