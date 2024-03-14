package SeliniumSample;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotSingleElement {
ChromeDriver driver;
@Before
public void before()
{
	driver =  new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void test() throws Exception
{
 WebElement noelement=driver.findElement(By.xpath("//*[@id=\"mobno\"]"));
	 File src = noelement.getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(src,new File("./Screenshot//numbershot.png"));
	 WebElement dayelement = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	 File src1 =  dayelement.getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(src1, new File("./Screenshot//day.png"));
	 
	 
}
}
