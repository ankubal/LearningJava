package cruiseboking1;

abstract class MyBookings {
	 

		private int days;
		private double totalPriceOfStay;
		
		public MyBookings( double totalpriceofstay,  int days) {
			this.totalPriceOfStay = totalpriceofstay;
			
			this.days = days;
		}

		
		public double getTotalpriceofstay() {
			return totalPriceOfStay;
		}


		public int getDays() {
			return days;
		}

		
	
		public abstract double calculateHotelPrice(int days, double totalPriceOfStay, MyBookings mybooking, int adult, int children,
				boolean meals); 
}

