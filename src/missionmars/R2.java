package missionmars;

public class R2 extends Rocket{
	public R2() {
		super(18, 29);
		
	}

	@Override
    public boolean launch() {
        double probability = 0.04 * ((double) getCargoCarried() / getMaxWeight());
        return Math.random() > probability;
    }

    @Override
    public boolean land() {
        double probability = 0.08 * ((double) getCargoCarried() / getMaxWeight());
        return Math.random() > probability;
    }
}
