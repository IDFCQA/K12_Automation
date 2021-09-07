package PageActions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.RegistrationObj;

public class RegistrationAct {

	static WebDriver driver;
	//Create a constructor to pass the driver
	public RegistrationAct(WebDriver driver1)
	{
		this.driver=driver1;
	}
	
	//Method for actions
	public static void register(String FirstName,String LastName,String EmailID, String MobileNum) throws Exception
	{
		PageFactory.initElements(driver, RegistrationObj.class);
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		Thread.sleep(13000);
		RegistrationObj.FName.sendKeys(FirstName);
		
		Thread.sleep(3000);
		RegistrationObj.LName.sendKeys(LastName);
		
		Thread.sleep(3000);
		RegistrationObj.Email.sendKeys(EmailID);
		
		Thread.sleep(3000);
		RegistrationObj.Mobile.sendKeys(MobileNum);
		
	    Thread.sleep(3000);
		RegistrationObj.Verify.click();
		
		Thread.sleep(40000);
		
		//Checkbox and CTA
		Thread.sleep(3000);
		RegistrationObj.TCCheckbox.click();
		
		takeSnapShot(driver,".\\Screenshots\\Registration.jpg");
		
		Thread.sleep(3000);
		RegistrationObj.CTA.click();
		
		
		
		
		
	}
	public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {

		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);
     }

	

}
