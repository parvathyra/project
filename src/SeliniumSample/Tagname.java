package SeliniumSample;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {
	ChromeDriver driver;
	@Before
	public void tag()
	{
		driver =  new ChromeDriver();
		driver.get("https://www.google.com");
//driver.manage().window().maximize();	
	}
	@Test
	public void test()
	{
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		
		
		for(WebElement s:li)
		{
			String links = s.getAttribute("href");
			String text = s.getText();
			System.out.println(links+"---"+text);
		}
	}

}
