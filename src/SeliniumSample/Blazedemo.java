package SeliniumSample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Blazedemo {
	ChromeDriver driver;
	
	@Before 
	public void reg()
	{
		ChromeOptions options = new ChromeOptions();//have any issue with the launching of browser
		options.addArguments("--remote-allow-orgins=*");
		options.addArguments("--disable-notifications");//to handle notifications
		driver = new ChromeDriver(options);
		driver.get("http://blazedemo.com/register");
	}
       @Test
       public void test()
       {
    	   driver.findElement(By.name("name")).sendKeys("parvathy");
    	   driver.findElement(By.name("company")).sendKeys("TCS");
    	   driver.findElement(By.name("email")).sendKeys("parvathy@gmail.com");
    	   driver.findElement(By.name("password")).sendKeys("12345");
    	   driver.findElement(By.name("password_confirmation")).sendKeys("12345");
//    	   driver.findElement(By.className("btn btn-primary")).click();
    	   driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();    	   // using relative xpath
    	   
       }
}
