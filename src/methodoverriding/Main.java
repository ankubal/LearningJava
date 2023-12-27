package methodoverriding;

public class Main {

	public static void main(String[] args) {

		SamsungRefrigerator samsungrefrigerator = new SamsungRefrigerator();
		samsungrefrigerator.selectmodels();

		BestBuy bb = new BestBuy();
		bb.selectmodels();
		bb.singledoor();
		bb.doubledoor();

		Walmart wl = new Walmart();

		wl.selectmodels();
		wl.singledoor();
		wl.doubledoor();

	}

}
