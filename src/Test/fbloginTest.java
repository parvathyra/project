package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.fblogin;

public class fbloginTest {
 
	WebDriver driver;
	
 @BeforeTest
 public void btest()
 {
	 driver =  new ChromeDriver();
	 
 }
 @BeforeMethod
 public void method()
 {
	 driver.get("https://www.facebook.com");
 }
 @Test
 public void test()
 {
	 fblogin fb =  new fblogin (driver);
	 fb.setvalues("parvathy@gmail.com", "12345");
	 fb.login();
	 
 }
}
