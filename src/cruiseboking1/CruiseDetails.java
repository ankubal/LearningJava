 package cruiseboking1;

public class CruiseDetails extends MyBookings{
	private String cruiseName;
	private double adultPrice;
	private double childPrice;
	private int days;

	public CruiseDetails(String cruiseName, double adultPrice, double childPrice, int days)
	{
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

	public  double calculatePrice(int adults, int children, boolean meals) {
		return 0;
	}

	@Override
	public double calculateHotelPrice(int days, double totalPriceOfStay, MyBookings mybooking, int adult, int children,
			boolean meals) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
