package SeliniumSample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsXpath {
	ChromeDriver driver;
	
@Before
public void abc()
{
 driver =  new ChromeDriver();
 driver.get("https://www.facebook.com");
}
@Test
public void test()
{
	driver.findElement(By.id("email")).sendKeys("kgky@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("123567");
	driver.findElement(By.xpath("//*[contains(@id,'u_0_5')]")).click();
}
}
