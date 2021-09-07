package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PANValidationObj {
	
	@FindBy(how=How.XPATH,using="//*[@id='pan_Number-20']")
	public static WebElement PANNum;
	
	@FindBy(how=How.XPATH,using="//*[@class='filled-nxt-btn']")
	public static WebElement PAN_Proceed;


}
