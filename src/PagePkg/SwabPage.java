package PagePkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwabPage {
	WebDriver driver;
	By username = By.xpath("//*[@id=\"user-name\"]");
	By fbpassword = By.xpath("//*[@id=\"password\"]");
	By login  = By.xpath("//*[@id=\"login-button\"]");
}
