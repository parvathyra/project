package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.login;



public class Swaglogin {
	WebDriver driver;
	
 @BeforeTest
 public void btest()
 {
	 driver =  new ChromeDriver();
	 
 }
 @BeforeMethod
 public void method()
 {
	 driver.get("https://www.saucedemo.com/v1/");
 }
 @Test
 public void test()
 {
	 login b =  new login (driver);
	 b.setValues("parvathy@gmail.com", "12345");
	 b.login();
	 
 }
}


