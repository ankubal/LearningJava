package dynamicInput;

public class CalculateFuelInjection {

	int xThrottle, yFuel;
	void CalculateFuelInjection() {
		
	if(xThrottle<=127)
	{
		yFuel=xThrottle*2;
		System.out.println("yFuel is :" + yFuel);
}
	else if(xThrottle<=128 && xThrottle<=255)
	{
		yFuel = xThrottle+127;
	}
	else {
	System.out.println("xThrottle should be between 1 to 255");
	}
}
}