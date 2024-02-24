package missionmars;

public class Rocket implements SpaceShip{

	private final int rocketWeight;
	private final int maxWeight;
	private int cargoCarried;

	public Rocket(int rocketWeight, int maxWeight) {
		this.rocketWeight = rocketWeight;
		this.maxWeight = maxWeight;
		this.setCargoCarried(0);
	}

	@Override
	public boolean launch() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean land() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean canCarry(Item item) {
		// TODO Auto-generated method stub
		return (getCargoCarried() + item.weight) <= getMaxWeight();
	}

	@Override
	public void carry(Item item) {
		setCargoCarried(getCargoCarried() + item.weight);

	}

	public int getCargoCarried() {
		return cargoCarried;
	}

	public void setCargoCarried(int cargoCarried) {
		this.cargoCarried = cargoCarried;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

}
