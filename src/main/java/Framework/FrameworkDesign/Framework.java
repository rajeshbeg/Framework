package Framework.FrameworkDesign;

import org.testng.annotations.Test;

public class Framework 
{
	@Test(groups={"priority1"})
   public void First()
    {
        System.out.println( "First World!" );
    }
	@Test
	   public void Second()
	    {
	        System.out.println( "Second World!" );
	    }
	@Test
	   public void Third()
	    {
	        System.out.println( "Third World!" );
	    }
}
