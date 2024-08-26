package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

// new, you have to manually write it to get access of common actions
// this is possible when they are static in nature, * means all
// This is called static import
import static common.CommonActions.*;

public class HomePage {
	WebDriver driver;

	// parameterized constructor initialized when class in instantiated [object created]
	public HomePage(WebDriver driver) {
		this.driver = driver;
		// PageFactory class help to instantiate WebElements
		// Important interview question
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "(img[@alt='Enthrall IT'])[1]")
WebElement logo;

@FindBy(xpath = "//a[@class='nav-link' and text()='Login']")
WebElement logoFromTollber;

@FindBy(xpath = "//input[@name='username']")
WebElement userId;

@FindBy(xpath = "//input[@name='password']")
WebElement passWord;

@FindBy(xpath = "//input[@type='submit']")
WebElement logInButton;

@FindBy(xpath = "//span[text()='Automation']")
WebElement automation;

@FindBy(partialLinkText = "Enroll")
WebElement enrollNow;

@FindBy(xpath = "//input[@name='f_name']")
WebElement fName;


	public void clickLogo() {
		logo.click(); // common method 'clickElement()' is not used here
	}
	
	
	public void clickUserId() {
		clickElement(logoFromTollber);
		pause(3000);
		clickElement(userId);
	}
	
	public void clickPassword() {
		clickElement(logoFromTollber);
		pause(3000);
		clickElement(passWord);
	}
	
	public void clickLoginButton() {
		clickElement(logoFromTollber);
		pause(4000); // common method 'pause()' is used from here
		clickElement(logInButton); // common method 'clickElement()' is used from here
		pause(4000);	
	}
	
	
	
	
	
	// We are using sendKeys() method to input the text in any field
	public void userIdSendkeys () {
		logoFromTollber.click();
		pause(4000);
		userId.sendKeys("tasnim"); // common method 'inputText()' is not used here
		pause(4000);
	}
	
	
	
	
	
	
	
	
	
	// use of isDisplayed method inside our common actions --> elementDisplayed()
	public void clickLogInButton () {
		elementDisplayed(userId); // newly added
		inputText(userId, "tasnimchowdhury.qa@gmail.com");
		pause(3000);
		elementDisplayed(passWord); // newly added
		inputText(passWord, "Darimee2010");
		
		pause(4000);
		clickElement(logInButton);
		pause(4000);
	}
	
	// Web Element: login Button
	// isEnabled() is the method used to verify if the web element is enabled or
	// disabled within the web page. isEnabled() is primarily used with buttons.
	// Use of isEnabled(), a boolean type method
	// use of isEnabled method inside elementEnabled()
	
	
	// Web Element: checkbox
	// Used with radio buttons, dropdowns and checkboxes.
	// use of isSelected() method inside
	
	public void use_of_isSelected_isDisPlayed_isEnable() {
		elementDisplayed(userId);
		inputText(userId, "tasnimchowdhury.qa@gmail.com");
		pause(3000);
		elementDisplayed(passWord);
		inputText(passWord, "OnthrallTest@1234");
		//elementSelected(termsAndCondition); 
		//clickElement(termsAndCondition);
		pause(4000);
		elementEnabled(logInButton); 
		clickElement(logInButton);
		pause(4000);
	}
	
	
	
	
	// This is the first method used during automation framework
	// what is title?
	// what is the url?
	// is logo displayed?
	// here, method coming from common action
	public void veryTitle_Url() {
		pause(3000);
		elementDisplayed(logo);
		verifyTitle(driver, "enthrallit.com");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");
		elementEnabled(logInButton);
		verifyTextOfTheWebElement(logInButton, "Log In");
		clickElement(logInButton);
		pause(5000);
		verifyTitle(driver, "CMS Enterprise Portal - New User Registration");
		verifyCurrentUrl(driver, "https://portal.cms.gov/portal/newuserregistration");
	}
	
	// Here We used User ID field
	// getAttribute() actually give the value of the Attribute, not common
	// raw use, in next method we will use from common action
	public void use_of_getAttribute_method () {
		elementSelected(userId);
		pause(3000);
		String ml = userId.getAttribute("maxlength");
		System.out.println("The value of the maxlength attribute is: " + ml);
		String ph = userId.getAttribute("placeholder");
		System.out.println("The value of the placeholder attribute is: " + ph);
	}
	
	// use of clear()
	public void use_of_clear_in_login() {
		elementDisplayed(userId);
		inputText(userId, "May 2024");
		elementDisplayed(passWord);
		inputText(passWord, "abc@1234213");
		pause(3000);
		clearTextFromTheField(userId); // new here
		pause(3000);
		clearTextFromTheField(passWord); // new here
		pause(3000);
		inputText(userId, "enthrall_12");		
		inputText(passWord, "OnthrallTest@1234");
		//elementSelected(termsAndCondition);
		//clickElement(termsAndCondition);
		
	}
public void use_of_navigate_method() {
	pause(3000);
	driver.navigate().to("https://portal.cms.gov/portal/");
	pause(3000);
	driver.navigate().back();
	pause(3000);
	driver.navigate().forward();
	pause(3000);
	driver.navigate().refresh();
}
	
	
	
	
	
	
	
	
	
	
	

	
	

}
