package SeliniumSample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdSearchLocator {

	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
	}
	@Test
	public void test()
	{
		driver.findElement(By.id("email")).sendKeys("parvathy@gmailcom");
		driver.findElement(By.id("pass")).sendKeys("909093");
	driver.findElement(By.name("login")).click();
	}
}
