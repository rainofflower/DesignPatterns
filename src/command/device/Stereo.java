package command.device;

public class Stereo {
	static int volume = 0;
	
	public void On(){
		System.out.println("Stereo On");;
	}
	
	public void Off(){
		System.out.println("Stereo Off");
	}

	//ѡ��Ƭ
	public void SetCd(){
		System.out.println("Stereo SetCd");		
	}
	
	public void SetVol(int vol){
		volume = vol;
		System.out.println("Stereo volumn="+volume);
	}
	
	public int GetVol(){
		return volume;
	}
	
	public void Start(){
		System.out.println("Stereo Start");
	}
}
