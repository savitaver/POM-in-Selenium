package POMselinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class TestPOM {

	WebDriver driver;

	public TestPOM(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "txtUsername")
	WebElement Username;

	@FindBy(how = How.ID, using = "txtPassword")
	WebElement Password;

	@FindBy(how = How.XPATH, using = "//*[@id=\"btnLogin\"]")
	WebElement loginBtn;

	public void LoginHRM(String Uname, String Psd) {
		Username.sendKeys(Uname);
		Password.sendKeys(Psd);
		loginBtn.click();

	}

}
