package methodoverriding;

public class Walmart extends SamsungRefrigerator {

	@Override
	public void selectmodels() {

		System.out.println("nexa available");

	}

	@Override
	public void singledoor() {

		System.out.println(" not avaliable");
	}
}