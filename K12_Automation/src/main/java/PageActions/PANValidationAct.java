package PageActions;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.PANValidationObj;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class PANValidationAct {

	static WebDriver driver;

	public PANValidationAct(WebDriver driver1) {
		this.driver = driver1;
	}

	public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {

		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);

	}

	public static void PANdetails(String PAN) throws Exception {
		PageFactory.initElements(driver, PANValidationObj.class);
		WebDriverWait wait = new WebDriverWait(driver, 5000);

		PANValidationObj.PANNum.sendKeys(PAN);
		takeSnapShot(driver,".\\Screenshots\\PAN_Input.jpg");
		wait.until(ExpectedConditions.elementToBeClickable(PANValidationObj.PAN_Proceed)).click();
		takeSnapShot(driver,".\\Screenshots\\PAN_Validation.jpg");

	}

}
