package BasePkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base {
	public WebDriver driver;
	@BeforeTest()
	public void test()
	{
		driver =  new ChromeDriver();
	}
	@BeforeMethod()
	public void url()
	{
		driver.get("https://www.saucedemo.com/v1/");
	}
	}



