package SeliniumSample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobtnChkbxLogo {

	ChromeDriver driver;
	@Before
	 
	public void befre()
	{
		driver= new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
	WebElement	logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]"));
	
	 if (logo.isDisplayed())
	 {
         System.out.println("Logo is displayed .");
     } else
     {
         System.out.println("Logo is not displayed.");
     }
		 
	WebElement checkbx= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
	 if(checkbx.isSelected())
	 {
         System.out.println("checked");
     } else
     {
         System.out.println("unchecked");
     }
	WebElement radio= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
	
	 if(checkbx.isEnabled())
	 {
         System.out.println("clicked");
     } else
     {
         System.out.println("unclicked");
     }
	 
	 
	}
}
