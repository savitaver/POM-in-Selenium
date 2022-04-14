package POMselinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerifyLogin {

	@Test
	public void TestUser() {
	WebDriver driver = BrowserFactory.BrowserOption("Chrome", "https://opensource-demo.orangehrmlive.com/")	;
	TestPOM login=PageFactory.initElements(driver,TestPOM.class);
    login.LoginHRM("Admin","admin123");
	}
}