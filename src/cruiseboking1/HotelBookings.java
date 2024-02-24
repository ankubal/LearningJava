package cruiseboking1;

public class HotelBookings extends MyBookings {

	public HotelBookings(double totalpriceofstay, int days) {
		super(totalpriceofstay, days);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public double calculatePrice(int days, double totalPriceOfStay,MyBookings mybooking,int adult, int children, boolean meals) {
		double totalPrice = totalPriceOfStay * getDays() ;
		if (meals) {
			totalPrice = (totalPrice + (adult * 25 + children * 5) * getDays())+(totalPrice + (adult * 25 + children * 5) * getDays())*0.18;
		}
		return totalPrice;
	}
}
