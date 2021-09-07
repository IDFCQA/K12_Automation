package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationObj {

	@FindBy(how=How.XPATH,using="//*[@name=\"first_name\"]")
	public static WebElement FName;
	
	@FindBy(how=How.XPATH ,using ="//*[@name=\"last_name\"]")
	public static WebElement LName;
	
	@FindBy(how=How.XPATH ,using ="//*[@name=\"email_addr\"]")
	public static WebElement Email;
	
	@FindBy(how=How.XPATH ,using ="//*[@name=\"mobileNumber\"]")
	public static WebElement Mobile;
	
	@FindBy(how=How.XPATH ,using ="//*[@class='verifyPosition']")
	public static WebElement Verify;
	
	@FindBy(how=How.XPATH ,using ="//*[@id=\"top-page-7\"]/section/section[2]/div/div[2]/div/div/div/div/div[2]/label/span")
	public static WebElement TCCheckbox;
	
	@FindBy(how=How.XPATH ,using ="//*[@class='unableLogin']")
	public static WebElement CTA;
}
