package pagesTest;


import org.testng.annotations.Test;
import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	
	// The test executed based on alphabetical order, if no priority given
	// (enabled = true) means The test case is not disable, it can run
	// (enabled = false) means The test case is disable, it is not running
	// priority = 1 means, this test case will run first, 2 means second .... ... so on
	
	@Test (enabled = true, priority = 1)
	public void clickLogoTest() {
		homePage.clickLogo();
	}
	
	
	@Test
	public void clickUserIdTest() {
		
		homePage.clickUserId();
	}
	
	@Test 
	public void clickPasswordTest() {
		homePage.clickPassword();
	}
	
	
	@Test (enabled = true, priority = 2)
	public void clickLoginButtonTest()  {
		homePage.clickLoginButton();
	}
	
	@Test
	public void userIdSendkeysTest() {
		homePage.userIdSendkeys();
	}
	@Test
	public void clickLogInButtonTest() {
		homePage.clickLoginButton();
	}
	@Test
	public void use_of_isSelected_isDisPlayed_isEnableTest() {
		homePage.use_of_isSelected_isDisPlayed_isEnable();
	}
	@Test
	public void veryTitle_UrlTest() {
		homePage.veryTitle_Url();
	}
	@Test
	public void use_of_getAttribute_methodTest ()  {
		homePage.use_of_getAttribute_method();
	}
	@Test
	public void use_of_clear_in_loginTest(){
		homePage.use_of_clear_in_login();
	}
	@Test
	public void use_of_navigate_methodTest() {
		homePage.use_of_navigate_method();
	}
	
}
