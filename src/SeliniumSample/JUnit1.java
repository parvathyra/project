package SeliniumSample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnit1 {
 ChromeDriver driver;
 
 
 @Before
 public void setp()
 {
	 driver =  new ChromeDriver();
	 driver.get("http://www.google.com");
 }
 @Test
 public void titleverification()
 {
	 String title =  driver.getTitle();
	 System.out.println(title);
    String exp = "google";
    if(title.equals(exp))
    {
    	System.out.println("pass");
    	
    }
    else
    {
    	System.out.println("fail");
    }
 }
    @Test
    public void content()
    {
    	String src=driver.getPageSource();
    	if(src.contains("google")) {
    		System.out.println("pass");
    	}
    	else {
    		System.out.println("fail");
    	}
    }
 
 @After
 public void close()
 {
	 driver.close();
 }
}
