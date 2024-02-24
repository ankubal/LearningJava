package cruiseBooking;

abstract class CruiseDetails {
	private String cruiseName;
	private double adultPrice;
	private double childPrice;
	private int days;

	public CruiseDetails(String cruiseName, double adultPrice, double childPrice, int days) {
		this.cruiseName = cruiseName;
		this.adultPrice = adultPrice;
		this.childPrice = childPrice;
		this.days = days;
	}

	public String getCruiseName() {
		return cruiseName;
	}

	public double getAdultPrice() {
		return adultPrice;
	}

	public double getChildPrice() {
		return childPrice;
	}

	public int getDays() {
		return days;
	}

	public abstract  double calculatePrice(int adults, int children, boolean meals);

}
