package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoanDetailsObj {
	
	@FindBy(how=How.XPATH,using="//*[@class='empt-nxt-btn2']")
	public static WebElement LD_Next;

}
