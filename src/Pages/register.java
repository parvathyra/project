package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class register {
	WebDriver driver;
	 
	By rname = By.id("name");
	By rcompany= By.id("company");
    By remail = By.id("email");
    By rpassword =By.id("password");
    By cpassword = By.id("password-confirm");
    By register = By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
    
    public register(WebDriver driver)
    {
    	this.driver =  driver;
    }
    public void setValues(String name, String company,String email,String password,String confirm_password)
    {
    	driver.findElement(rname).sendKeys(name);
    	driver.findElement(rcompany).sendKeys(company);
    	driver.findElement(remail).sendKeys(email);
    	driver.findElement(rpassword).sendKeys(password);
    	driver.findElement(cpassword).sendKeys(confirm_password);
    	
    }
    public void rregister()
    {
    	driver.findElement(register).click();
    }
}
