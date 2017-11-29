package command.device;

public class Light {
	
	//¾ßÌåµÄµÆ
	String loc = "";

	public Light(String loc) {
		super();
		this.loc = loc;
	}
	
	public void On(){
		System.out.println(loc + " On");;
	}
	
	public void Off(){
		System.out.println(loc +" Off");
	}
}

