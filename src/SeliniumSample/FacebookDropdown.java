package SeliniumSample;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
}
	@Test
	public void test()
	{
	WebElement day=driver.findElement(By.xpath("//*[@id=\"day\"]"));
	
       Select s=new Select(day);
       List <WebElement> li= s.getOptions();
       System.out.println("no of days "+ li.size());
       
       WebElement month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
       Select m= new Select(month);
       List <WebElement> li1=m.getOptions();
		System.out.println("No of months "+ li1.size());
		
		  WebElement year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
	       Select y= new Select(year);
	       List <WebElement> li2=y.getOptions();
			System.out.println("No of year "+ li2.size());
		
	}
	
}
