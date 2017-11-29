package facade.hometheater;

public class Stereo {
	private int volume = 5;
	private Stereo(){
		
	}
	
	private static class SingletonHolder{
		static Stereo instance = new Stereo();
	}
	
	
	public static Stereo getInstance(){
		return SingletonHolder.instance;
	}
	
	public void on(){
		System.out.println("Stereo On");
	}
	
	public void off(){
		System.out.println("Stereo Off");
	}
	
	public void setVolume(int vol){
		volume = vol;
		System.out.println("the volume of Stereo is"+volume);
	}
	
	public void addVolume(){
		if(volume<11){
			volume++;
			setVolume(volume);
		}
	}
	
	public void subVolume(){
		if(volume>0){
			volume--;
			setVolume(volume);
		}
	}
	
}
