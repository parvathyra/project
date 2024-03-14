package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {

	WebDriver driver;
	By lemail = By.id("email");
	By lpassword = By.id("password");
	By llogin = By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
	 
	public login(WebDriver driver)
	{
		this.driver = driver;
	}
	public void setValues(String email,String password)
	{
		driver.findElement(lemail).sendKeys(email);
		driver.findElement(lpassword).sendKeys(password);
		
	}
	public void blogin()
	{
		driver.findElement(llogin).click();
	}
}
