package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mousehover {

	WebDriver driver;
	@BeforeTest
	public void btest()
	{
	 driver = new ChromeDriver();
	}
	@BeforeMethod
	public void method()
	{
		driver.get("https://www.ebay.com");
	}
	@Test
	public void test()
	{
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//implicit wait
	  WebElement mhover=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
	  Actions act = new Actions(driver);
	  act.moveToElement(mhover).perform();
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30)); // explicit waits
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
	  
	  driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
	  
	}
}
