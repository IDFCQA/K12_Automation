package PageActions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.SchoolMasterObj;

public class SchoolMasterAct {
	
	//Passing the driver
	static WebDriver driver;
	public SchoolMasterAct(WebDriver driver1)
	{
		this.driver=driver1;
	}
	
	public static void schoolinfo(String City, String School, String Name, String Std, String Section, String Term, String CourseFee,String Journey) throws Exception
	{
		PageFactory.initElements(driver, SchoolMasterObj.class);
		WebDriverWait wait = new WebDriverWait(driver,10);
		Thread.sleep(5000);
		
		SchoolMasterObj.City_Input.sendKeys(City);
		Thread.sleep(3000);
		
		String text = SchoolMasterObj.CityJamshedpur.getAttribute("innerHTML");
		SchoolMasterObj.City_Input.clear();
		SchoolMasterObj.City_Input.sendKeys(text);
		
		if(Journey.equalsIgnoreCase("Non Partner"))
		{
			SchoolMasterObj.School_Input.sendKeys(School);
			Thread.sleep(2000);

			String text1 = SchoolMasterObj.SchoolNonPartner.getAttribute("innerHTML");
			SchoolMasterObj.School_Input.clear();
			SchoolMasterObj.School_Input.sendKeys(text1,Keys.ENTER);
			wait.until(ExpectedConditions.visibilityOf(SchoolMasterObj.NP_Schoolname));
		    SchoolMasterObj.NP_Schoolname.sendKeys("ABC School");
			Thread.sleep(3000);
			
		}
		else
		{
		
		SchoolMasterObj.School_Input.sendKeys(School);
		Thread.sleep(2000);
		String text1 = SchoolMasterObj.SchoolPartner.getAttribute("innerHTML");
		SchoolMasterObj.School_Input.clear();
		SchoolMasterObj.School_Input.sendKeys(text1);
		Thread.sleep(3000);
		
		}
		
		SchoolMasterObj.FullName.sendKeys(Name,Keys.ENTER);
		Thread.sleep(3000);
		
		Select dropdown1 = new Select(SchoolMasterObj.Standard);  
		dropdown1.selectByVisibleText(Std); 
		Thread.sleep(3000);
		
		Select dropdown2 = new Select(SchoolMasterObj.Section);  
		dropdown2.selectByVisibleText(Section);
		Thread.sleep(3000);
		
		Select dropdown3 = new Select(SchoolMasterObj.Term);  
		dropdown3.selectByVisibleText(Term);
		Thread.sleep(3000);
		
		if(Journey.equalsIgnoreCase("Non Partner"))
		{
			SchoolMasterObj.Fees.sendKeys(CourseFee,Keys.ENTER);
			
		}
		takeSnapShot(driver,".//Screenshots//SchoolInfo.jpg");
		SchoolMasterObj.Next.click();
		
		
		
	}
	public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {

		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);
     }


}
