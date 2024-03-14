package SeliniumSample;

import org.openqa.selenium.chrome.ChromeDriver;

public class titleVerification {

	public static void main(String[] args) {
                 ChromeDriver driver = new ChromeDriver();
                 driver.get("http://www.google.com");
                 String actualtitle =driver.getTitle();
                 String expectedtitle = "google23";
                 if(actualtitle.equals(expectedtitle))
                 {
                	 System.out.println("pass");
                 }
                 
                 else
                 {
                	 System.out.println("fail");
                 }
	}

}
