package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fileUploadSendkeys {
	WebDriver driver;
	
	@BeforeTest
	public void btest()
	{
		driver =  new ChromeDriver();
	}
	@BeforeMethod
	public void method()
	{
		driver.get("https://demo.guru99.com/test/upload/");
	}

	@Test
	public void test()
	{
		
        driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("D:\\rediff.png");
        driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();	
	}
        @Test
        public void submit()
        {
     	   driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/ul/li/div[1]/button")).click();
        }

       

}

