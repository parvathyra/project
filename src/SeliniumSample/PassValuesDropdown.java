package SeliniumSample;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PassValuesDropdown {

		ChromeDriver driver;
		@Before
		public void setup()
		{
			driver = new ChromeDriver();
			driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
			driver.manage().window().maximize();
	}
   @Test
   public void test()
   {
	WebElement day  =driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	Select s=new Select(day);
	s.selectByIndex (3);

	//s.selectByValue("03");
	//s.selectByVisibleText("");
	
	  WebElement month=  driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	  Select ob=new Select(month);
		ob.selectByValue("03");
		
	WebElement	year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	Select ob1=new Select(year);
	ob1.selectByVisibleText("2024");
	List<WebElement> li= s.getOptions();
List<WebElement> li1=ob.getOptions();
 List<WebElement> li2=ob1.getOptions();
 System.out.println("count of days "+li.size());
 System.out.println("count of months "+li1.size());
 System.out.println("count of year "+li2.size());
   
   
   }

}

