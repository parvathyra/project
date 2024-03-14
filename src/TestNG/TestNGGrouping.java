package TestNG;


import org.testng.annotations.Test;

public class TestNGGrouping {
	@Test(groups= {"Sanity"})
	public void main1()
	{
		System.out.println("This is main1");
	}
	@Test(groups= {"Sanity","Smoke"})
	public void main2()
	{
		System.out.println("This is main2");
	}
	@Test(groups= {"regression"})
	public void main3()
	{
		System.out.println("This is main3");
		
	}
	@Test(groups= {"Sanity","regression"})
	public void main4()
	{
		System.out.println("This is main4");
	}
	@Test(groups= {"regression"})
	public void main5()
	{
		System.out.println("This is main5");
	}

}
