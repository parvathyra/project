package SeliniumSample;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotRediff {
	ChromeDriver driver;
	
	@Before
	public void rediff()
	{
		driver =  new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws Exception
	{
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot, new File("D:\\rediff.png"));
	}

}
