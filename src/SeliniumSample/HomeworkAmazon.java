package SeliniumSample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkAmazon {
	ChromeDriver driver;
	
	@Before
	public void amazon()
	{
		driver =  new ChromeDriver();
		driver.get("https://www.amazon.in");
		
	}
	@Test
	public void test() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='nav-cart-text-container']/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='nav-tools']/a/div/span")).click();

		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("jujc");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='navSwmHoliday']/a")).click();
		driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']/i")).click();
		}
	

}
