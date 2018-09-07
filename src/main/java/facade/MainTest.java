package facade;

import facade.hometheater.HomeTheaterFacade;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
		
		homeTheaterFacade.ready();
		homeTheaterFacade.play();
	}

}
