package Test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import Pages.login;

public class logintest {
	WebDriver driver;
	@BeforeTest()
	public void btest()
	{
		driver = new ChromeDriver();
	}
@BeforeTest()
public void method()
{
	driver.get("https://blazedemo.com/login");
}
@Test()
public void test()
{
	login l = new login(driver);
	l.setValues("parvathy123@gmail.com", "parvathy123");
	l.blogin();
}
}
