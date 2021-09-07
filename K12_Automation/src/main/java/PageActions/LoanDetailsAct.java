package PageActions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.LoanDetailsObj;


public class LoanDetailsAct {
	
	static WebDriver driver;
	public LoanDetailsAct(WebDriver driver1)
	{
		this.driver=driver1;
	}
	public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {

		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);
     }

	
	public static void loanamount() throws Exception
	{
		PageFactory.initElements(driver, LoanDetailsObj.class);
		Thread.sleep(3000);
		takeSnapShot(driver,".\\Screenshots\\LoanDetails.jpg");
		WebDriverWait wait = new WebDriverWait(driver,5000);
		wait.until(ExpectedConditions.elementToBeClickable(LoanDetailsObj.LD_Next)).click();
		
	}
	
	
}
