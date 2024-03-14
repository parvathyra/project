package SeliniumSample;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookContentVerifaction {

	public static void main(String[] args) {
	ChromeDriver driver = new  ChromeDriver();
	driver.get("http://www.facebook.com");
	String src = driver.getPageSource();
	if(src.contains("facebook"))
	{
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	
	}

}
