package SeliniumSample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoqaAlert {
ChromeDriver driver;

@Before
public void qa()
{
	driver =  new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	
}
@Test
public void test()
{
	
driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();

	driver.switchTo().alert().accept();
//  driver.switchTo().alert().dismiss();
  
	
	
}
}
