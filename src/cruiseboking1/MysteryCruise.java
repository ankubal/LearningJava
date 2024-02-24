package cruiseboking1;

public class MysteryCruise extends CruiseDetails {

	public MysteryCruise(String cruiseName, double adultPrice, double childPrice, int days) {
		super(cruiseName, adultPrice, childPrice, days);

	}

	@Override
	public double calculatePrice(int adults, int children, boolean meals) {
		double totalPrice = (adults * getAdultPrice() + children * getChildPrice()) * getDays();
		if (meals) {
			totalPrice = totalPrice + (adults * 20.99 + children * 4.99) * getDays();

		}
		return totalPrice;
	}
}