package StepDefinition;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageActions.LoanDetailsAct;
import PageActions.PANValidationAct;
import PageActions.RegistrationAct;
import PageActions.SchoolMasterAct;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class StepDefinition {
	
	WebDriver driver;
	
	@Given("^Customer launches the Community portal \"([^\"]*)\"$")
	public void customer_launches_the_Community_portal(String URL) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		//Launching community portal
		driver.get(URL);
		driver.manage().window().maximize();
	}

	@Then("Customer registers himself as a new user providing the following details {string} {string} {string} {string}")
	public void customer_registers_himself_as_a_new_user_providing_the_following_details(String FirstName, String LastName, String EmailID, String MobileNum) throws Exception {
	   PageFactory.initElements(driver, RegistrationAct.class); 
	   RegistrationAct.register(FirstName, LastName, EmailID, MobileNum);
	}
	
	@Then("Customer inputs the school and student details {string} {string} {string} {string} {string} {string} {string} {string}")
	public void customer_inputs_the_school_and_student_details(String City, String School, String Name, String Std, String Section, String Term, String CourseFee,String Journey) throws Exception {
		PageFactory.initElements(driver,SchoolMasterAct.class);
		SchoolMasterAct.schoolinfo(City, School, Name, Std, Section, Term, CourseFee,Journey);
	   
	}
	@Then("Customer enters the required loan amount")
	public void customer_enters_the_required_loan_amount() throws Exception {
		PageFactory.initElements(driver,LoanDetailsAct.class);
		LoanDetailsAct.loanamount();
		
	}
	
	@Then("Customer enters the PAN Number {string}")
	public void customer_enters_the_pan_number(String PAN) throws Exception {
		
		PageFactory.initElements(driver,PANValidationAct.class);
		PANValidationAct.PANdetails(PAN);
	}
    




                         
}
