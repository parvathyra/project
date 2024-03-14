package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbloginPageFactory {
	
	WebDriver driver;
	@FindBy(id="email")
	WebElement fbemail;
	
	@FindBy(id="password")
	WebElement fbpassword;
	
	@FindBy (id="login")
	WebElement fblogin;
	
	
	public fbloginPageFactory(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
		}
	public void setValues(String email,String password)
	{
		fbemail.sendKeys(email);
		fbpassword.sendKeys(password);
		
	}
	public void login()
	{
		fblogin.click();
	}
	

}
