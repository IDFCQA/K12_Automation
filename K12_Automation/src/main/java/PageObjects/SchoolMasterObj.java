package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SchoolMasterObj {
	
	@FindBy(how=How.XPATH,using = "//*[@name=\"city_name\"]")
	public static WebElement City_Input;
	
	@FindBy(how=How.XPATH,using = "//*[@class=\"cityValueList\"]/option[6811]")
	public static WebElement CityJamshedpur;
	
	@FindBy(how=How.XPATH,using = "//*[@name=\"school\"]")
	public static WebElement School_Input;
	
	@FindBy(how=How.XPATH,using = "//*[@class=\"schoolValueList\"]/option[1]")
	public static WebElement SchoolPartner;
	
	@FindBy(how=How.XPATH,using = "//*[@class=\"schoolValueList\"]/option[2]")
	public static WebElement SchoolNonPartner;
	
	@FindBy(how=How.XPATH,using = "//*[@name=\"school_Name\"]")
	public static WebElement NP_Schoolname;
	
	@FindBy(how=How.XPATH,using = "//*[@name=\"full_name\"]")
	public static WebElement FullName;
	
	@FindBy(how=How.XPATH,using = "//*[@name=\"standard\"]")
	public static WebElement Standard;
	
	@FindBy(how=How.XPATH,using = "//*[@name=\"section\"]")
	public static WebElement Section;
	
	@FindBy(how=How.XPATH,using = "//*[@name=\"term\"]")
	public static WebElement Term;
	
	@FindBy(how=How.XPATH,using = "//*[@name='course_fee']")
	public static WebElement Fees;
	
	@FindBy(how=How.XPATH,using = "//*[@class='filled-nxt-btn']")
	public static WebElement Next;
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
