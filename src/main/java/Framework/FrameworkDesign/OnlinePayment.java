package Framework.FrameworkDesign;

import org.testng.annotations.Test;

public class OnlinePayment {
@Test(groups={"priority1"})
public void OpenBrowsser()
	{
		System.out.println("Opening browser");
	}
@Test
public void FlightBooking()
 {
 System.out.println("Flight booking is executing");	
 }
@Test
public void Payment()
{
	System.out.println("Payment is going on");	
}
}
