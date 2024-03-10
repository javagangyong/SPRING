package p2;

public class BatteryAA implements Battery {
	
	private int energy;
	
	public BatteryAA() {
	}

	public BatteryAA(int energy) {	// <constructor-arg>
		this.energy = energy;
	}
	
	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {	// <property>
		this.energy = energy;
	}
	
	public void useEnergy() {
		this.energy -= 10;
	}
	
}
