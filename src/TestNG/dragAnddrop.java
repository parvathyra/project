package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dragAnddrop {
	WebDriver driver;
	@BeforeTest
	public void btest()
	{
		driver =  new ChromeDriver();
	}
	@BeforeMethod
	public void method()
	{
		driver.get("https://demoqa.com/droppable");
	}

	@Test
	public void testt()
	{
		 WebElement dg=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		 WebElement dp= driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		 Actions act =  new Actions(driver);
		 act.dragAndDrop(dg,dp);
		 act.perform();
		 String text = dp.getText();
		 if(text.equalsIgnoreCase("dropped!"))
		 {
			 System.out.println("passed");
			 
		 }
		 else
		 {
			 System.out.println("fail");
		 }
				 
		 
		 
		 
		 
	}
}
