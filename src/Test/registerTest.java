package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.register;

public class registerTest {
WebDriver driver;
@BeforeTest()
public void btest()
{
	driver = new ChromeDriver();
	
}
@BeforeMethod()
public void method()

{
	driver.get("https://www.blazedemo.com/register");
}
@Test
public void test()
{
	register r = new register (driver);
	r.setValues("parvathy","luminar", "parvathyjayaprakash691@gmail.com", "123parvathy", "123parvathy");
	r.rregister();
}
}
