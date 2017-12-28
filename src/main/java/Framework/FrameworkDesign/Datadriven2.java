package Framework.FrameworkDesign;

import org.testng.annotations.Test;

public class Datadriven2 extends Datadriven{
	@Test
	public void Userverification(){
		
		System.out.println(prop.getProperty("userpin")+"  : datadriven2");
	}
	@Test
	public void Status(){
		
	}
	@Test(dependsOnMethods={"Status"})
	public void Login(){
		
	}

}
