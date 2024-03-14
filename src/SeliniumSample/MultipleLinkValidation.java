package SeliniumSample;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinkValidation {

	ChromeDriver driver;
	
	@Before
	public void mul()
	{
	driver =  new ChromeDriver();
	driver.get("https://www.google.com");
		}
	@Test
	public void link() 	{
	List <WebElement> li = driver.findElements(By.tagName("a"));
	for(WebElement s:li)
	{
		String links = s.getAttribute("href");
		verify(links);
	}
		
		
	}
	
	public void verify(String links)
{
		try {
			URL ob = new URL(links);
			HttpURLConnection con = (HttpURLConnection)ob.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("Valid "+links);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("broken link "+links);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
	
}
}
