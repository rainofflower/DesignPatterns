package adapter;

import adapter.PhysicalRocket;
import adapter.RocketSim;

public class OozinozRocket extends PhysicalRocket implements RocketSim {

	private double time;
	public OozinozRocket(double burnArea, double burnRate, double fuelMass,
			double totalMass) {
		super(burnArea, burnRate, fuelMass, totalMass);
		// TODO Auto-generated constructor stub
	}

	public double getMass() {
		// TODO Auto-generated method stub
		return getMass(time);
	}

	public double getThrust() {
		// TODO Auto-generated method stub
		return getThrust(time);
	}

	public void setSimTime(double time) {
		// TODO Auto-generated method stub
		this.time = time;
	}

}
