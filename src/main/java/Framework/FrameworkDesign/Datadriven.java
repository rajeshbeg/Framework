package Framework.FrameworkDesign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.BrokenBarrierException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
	public static WebDriver driver=null;
	static Properties prop=  new Properties();
	static FileInputStream fis=null ; 
	
	@BeforeTest
	public static void Enterpin() throws IOException{
		fis=new FileInputStream("C:\\Users\\Rajesh_B\\workspace\\FrameworkDesign\\src\\main\\java\\Framework\\FrameworkDesign\\datadriven.properties");
		
		prop.load(fis);
		if(prop.getProperty("browser").equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\Google Drive\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(prop.getProperty("browser").equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\automation testing\\Alljars\\New Jar with3.0 Selenium\\geckodriver.exe");
	       driver=new FirefoxDriver();
		}	
		driver.get("http://google.co.in");
    System.out.println(prop.getProperty("userpin"));
    //System.out.println(prop.getProperty("amount"));
	}
	@Test(enabled=false)
	public void Amount() throws IOException{
		System.out.println(prop.getProperty("amount"));
	}
	@Test(enabled=false)
	public void Transaction(){
		System.out.println(prop.getProperty("status"));
	}

}
