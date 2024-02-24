package missionmars;

public class R1 extends Rocket{

	public R1() {
		super(10, 18);
		
	}
	@Override
    public boolean launch() {
        double probability = 0.05 * ((double) getCargoCarried() / getMaxWeight());
        return Math.random() > probability;
    }

    @Override
    public boolean land() {
        double probability = 0.01 * ((double) getCargoCarried() / getMaxWeight());
        return Math.random() > probability;
    }

}
