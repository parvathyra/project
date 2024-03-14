package SeliniumSample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v119.browser.Browser;

public  class Xpath {
	
	 ChromeDriver driver ;
	 
	 @Before
	 
	 public void path()
	 {
		 driver = new ChromeDriver();
		 driver.get("http://www.facebook.com");
		 
	 }
	 @Test
	 public void test()
	 {
		 driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("abc123");//absolute xpath
		 driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("aabc567"); // relative xpath
		 driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	 }
    @After
    public void close()
    {
     driver.close();
    }
}
