package SeliniumSample;

import org.openqa.selenium.chrome.ChromeDriver;



public class GoogleProgram {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver(); // to launch chromedriver
	driver.get("http://www.google.com");
//	driver.get("http://www.facebook.com");
	String actualtitle=driver.getTitle();
	System.out.println(actualtitle);

	}

}
