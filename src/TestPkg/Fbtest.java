package TestPkg;

import org.testng.annotations.Test;

import BasePkg.BaseClass;
import PagePkg.Fbpage;
import UtilityPkg.Excelutil;

public class Fbtest  extends BaseClass{
	@Test
	public void VerifyLoginWithValidCred () throws Exception 
	{
		Fbpage p1 =new Fbpage(driver);
		
		//Reading data from excel file by the specified path
		
		String xl = "D:\\facebooklogin.xlsx";
		String Sheet = "Sheet1";
		int rowCount = Excelutil.getRowCount(xl, Sheet);
		for(int i=1;i<rowCount;i++)
		{
			String UserName = Excelutil.getCellValue(xl, Sheet, i, 0);
			System.out.println("username"+UserName);
			String Pwd = Excelutil.getCellValue(xl, Sheet, i, 0) ;
			System.out.println("password"+Pwd);
			
			// passing username and password as parameters

			//Submitting the data by clicking on login button
			
			//p1.setvalues("","");
			p1.setValues(UserName, Pwd);
			p1.login();
		}
	}

}
