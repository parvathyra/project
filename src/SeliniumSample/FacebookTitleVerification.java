package SeliniumSample;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitleVerification {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		String actualTitle = driver.getTitle();
	String	expectedTitle = "facebook";
	if(actualTitle.equals(expectedTitle))
	{
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
	}

}
