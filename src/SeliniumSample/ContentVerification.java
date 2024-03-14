package SeliniumSample;

import org.openqa.selenium.chrome.ChromeDriver;

public class ContentVerification {

	public static void main(String[] args) {
          ChromeDriver driver = new ChromeDriver();
          driver .get("http://www.google.com");
          String src = driver.getPageSource();
          if(src.contains("Gmail"))
          {
        	  System.out.println("Pass");
          }
          else
          {
        	  System.out.println("fail");
          }
	}

}
