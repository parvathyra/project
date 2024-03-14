package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.fblogin;

public class fbloginTestPageFactory {
	
		WebDriver driver;
		@BeforeTest()
		public void btest()
		{
			driver = new ChromeDriver();
		}
	@BeforeTest()
	public void method()
	{
		driver.get("https://www.facebook.com");
	}
	
	@Test()
	public void testlogin()
	{
		fblogin ob = new fblogin(driver);
		ob.setvalues("abc@gmail.com", "1234");
		ob.login();
	}

}
