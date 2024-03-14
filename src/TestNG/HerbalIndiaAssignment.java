package TestNG;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HerbalIndiaAssignment {

	WebDriver driver;
	@BeforeTest
	public void before()
	{
		driver = new ChromeDriver();
			
	}
	@Test
	public void test() throws Exception
	{
		driver.get("https://rishiherbalindia.linker.store/");
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();
		Thread.sleep(100);
//	driver.findElement(By.name("email")).sendKeys("parvathy@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("parvathy1129@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Parvathy123456789");
		
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"register-model-signin-link\"]")).click();
driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Parvathy123456789");

driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("HERBAL AGRO GROWTH BOOSTER",Keys.ENTER);
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"searchDDWrp\"]/ul/div[4]/div/div/li[1]/div/div[2]/a")).click();
driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")).click();
driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
driver.findElement(By.xpath("//*[@id=\"column-left\"]/div[1]/div[2]/ul/li[4]/a")).click();
driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")).click();
driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();
driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();
driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[5]/a")).click();
driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[6]/a")).click();
driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[7]/a")).click();
driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[8]/a")).click();
driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[9]/span/a")).click();

	}


	@Test
	public void scrolldown()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)" );
		driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click();
	}
	@Test
	public void screenshot() throws Exception
	{
		WebElement privacy=driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[4]/div/ul/li[1]/a"));
		File src1=privacy.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./Screenshot//privacypolicy.png"));
	}
	@Test
	public void responsecode() throws Exception
	{
		  String baseurl = null;
		URL ob=new URL(baseurl);
	      HttpURLConnection con	=(HttpURLConnection)ob.openConnection();
	      con.connect();
	      if(con.getResponseCode()==200)
	      {
	    	  System.out.println("valid------"+baseurl);
	      }
	      else
	      {
	    	  System.out.println("invalid------"+baseurl);
	      }
	}
	}
	